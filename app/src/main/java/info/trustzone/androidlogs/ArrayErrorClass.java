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

    int GetValueCatch(int aIdx) {
        int res;
        try {
            res= intArray[aIdx];
            return res;
            //Log.i(TAG, "Wiered, after Return"); // Would originate compile error, unreachable
        } catch (Exception e) {
            Log.i(TAG, "Error caught");
        }
        Log.i (TAG,"After TryCatch");
        return 0;
    }

    private int GetValueThrow(int aIdx) throws CustomError {
        // Throws a custom exception on index=2
        if (aIdx == 2) {
            throw new CustomError("idx cannot equal 2");
        } else {
            return intArray[aIdx];
        }
    }

    int GetValueThrowInner(int aIdx) throws Exception {
        return GetValueThrow(aIdx);
    }
}
