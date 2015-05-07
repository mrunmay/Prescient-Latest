package za.co.prescient.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.app.AlertDialog;
import za.co.prescient.R;
import android.app.Dialog;

/**
 * Created by Bibhuti on 2014/07/30.
 */
public class AlertActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = this.getLayoutInflater();
        View content = inflater.inflate(R.layout.alertactivitylayout, null);
        final AlertDialog.Builder dialog = new AlertDialog.Builder(new ContextThemeWrapper(this, android.R.style.Theme_Holo_Light));
        dialog.setTitle("Test Dialog Test");
        dialog.setMessage("Happy Bday");

         dialog.setPositiveButton("ok",new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                 Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_SHORT).show();

             }
         });


        dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "cancel", Toast.LENGTH_SHORT).show();


            }
        });
        dialog.show();



        Toast.makeText(getApplicationContext(), "Alert Activity " + ApplicationData.guest.getHotelId(), Toast.LENGTH_SHORT).show();

    }


}