package com.nuopushi.sys.app.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "MyReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean down = intent.getBooleanExtra("down", true);
        Log.i(TAG, "onReceive: "+down);
        Toast.makeText(context,"receive",Toast.LENGTH_SHORT).show();
    }
}
