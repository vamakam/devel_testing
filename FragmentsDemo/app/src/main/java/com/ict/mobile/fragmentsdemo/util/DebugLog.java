package com.ict.mobile.fragmentsdemo.util;

import android.support.annotation.Nullable;
import android.util.Log;

public class DebugLog {

    public static void log() {
        Log.d(TAG, getClassName() + getMethodName());
    }

    private static String getClassName() {
        StackTraceElement caller = Thread.currentThread().getStackTrace()[4];
        String c = caller.getClassName() + "::";
        return (c.substring(c.lastIndexOf(".") + 1, c.length()));
    }

    private static String getMethodName() {
        StackTraceElement caller =
                Thread.currentThread().getStackTrace()[4];
        StringBuilder sb = new StringBuilder(3);
        sb.append(caller.getMethodName());
        sb.append("()::");
        sb.append(caller.getLineNumber());
        return sb.toString();
    }

    private static final String TAG = "FragmentsDemo";
}
