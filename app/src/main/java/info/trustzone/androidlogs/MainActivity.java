package info.trustzone.androidlogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

//import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private int ct_times;

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
        Log.i(TAG,"After the catch, proceeding");
    }

    public void btnErrorNoCatch(View view) {
        ArrayErrorClass a = new ArrayErrorClass(3);
        a.SetValue(0,1);
        a.SetValue(3,1);
    }

    public void btnFunctionDoingCatch(View view) {
        int i;
        ArrayErrorClass arr=new ArrayErrorClass(3);
        i=arr.GetValueCatch(3);
        Log.i(TAG,"getValueCatch returned " + Integer.toString(i));
        Log.i(TAG, "Back to Btn withou errors");
    }

    public void btnThrowCustomError(View view) {
        int i;
        try {
            ct_times=ct_times+1;
            ArrayErrorClass arr = new ArrayErrorClass(5);
            Log.i(TAG, "Testing Idx=" + Integer.toString(ct_times));
            i = arr.GetValueThrowInner(ct_times);
        } catch (Exception e) {
            Log.i(TAG,"In the main module: "+e, e);
        }
    }

}
