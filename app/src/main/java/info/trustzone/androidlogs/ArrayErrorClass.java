package info.trustzone.androidlogs;

//import android.util.Log;
import android.util.Log;

/**
 * Created by andre on 2017-12-16.
 * Just a first class
 */

class ArrayErrorClass {
    private int[] intArray;

    private static final String TAG = "MyTag";

    public ArrayErrorClass() {
        intArray=new int[5];
    }

    ArrayErrorClass(int nArgs) {
        intArray=new int[nArgs];
    }

    void SetValue(int aIdx, int aValue) {
        intArray[aIdx]=aValue;
    }

    //public int GetValueNoCatch(int aIdx) {
    //    return intArray[aIdx];
    //}

    public int GetValueCatch(int aIdx) {
        try {
            return intArray[aIdx];
            //Log.i(TAG, "After Return");
        } catch (Exception e) {
            Log.i(TAG, "Error caught");
        }
        Log.i (TAG,"After TryCatch");
        return 0;
    }

    //public int GetValueThrow(int aIdx) throws ArrayIndexOutOfBoundsException {
    //    if (aIdx>= intArray.length) {
    //        throw new ArrayIndexOutOfBoundsException("Max index is " + integer.ToString(aIdx));
    //    } else {
    //        return intArray[aIdx];
    //    }
    //}
}
