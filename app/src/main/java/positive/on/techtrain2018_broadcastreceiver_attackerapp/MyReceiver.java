package positive.on.techtrain2018_broadcastreceiver_attackerapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String to = intent.getStringExtra("to");
        String amount = intent.getStringExtra("amount");
        Toast.makeText(context,"*** ATTACKER APP ***\nto: "+to+", amount: "+amount,Toast.LENGTH_LONG).show();
    }
}
