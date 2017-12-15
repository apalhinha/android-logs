package info.trustzone.androidlogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void writeLogExample(View view) {
        Log.i(TAG, "Here I go, writing in the log");
    }

    public void tryCatchExample(View view) {
        Log.i(TAG, "I will now divide by 0");
        try {
            Log.i(TAG,"Value="+1/0);
        } catch (Exception e) {
            Log.e(TAG,"Ooops, error caught");
        }
    }
}
