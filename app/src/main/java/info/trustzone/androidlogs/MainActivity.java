package info.trustzone.androidlogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

//import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnWriteLog(View view) {
        Log.i(TAG, "Here I go, writing in the log");
    }

    public void btnTryCatch(View view) {
        int a;
        Log.i(TAG, "I will now divide by 0");
        try {
            a=0;
            Log.i(TAG,"Value="+1/a);
        } catch (Exception e) {
            Log.e(TAG,"Ooops, error caught");
        }
    }

    public void btnErrorNoCatch(View view) {
        ArrayErrorClass a = new ArrayErrorClass(3);
        a.SetValue(4,1);

    }
}
