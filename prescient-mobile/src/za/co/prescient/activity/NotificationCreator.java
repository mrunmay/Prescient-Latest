package za.co.prescient.activity;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import za.co.prescient.R;
import android.support.v4.app.NotificationCompat;



/**
 * Created by Bibhuti on 2014/06/19.
 */
public class NotificationCreator extends Activity {
    NotificationManager NM;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_main);
    }


    /*public void createNotification(View view) {
        // Prepare intent which is triggered if the
        // notification is selected
       NotificationManager notificationManager=(NotificationManager)getSystemService(getApplicationContext().NOTIFICATION_SERVICE);
        Notification notify=new Notification(android.R.drawable.stat_notify_more,"Test",System.currentTimeMillis());

   }
*/


    @SuppressWarnings("deprecation")
    public void notify(View vobj){

        String title = "Greeting";
        String subject = "Birthday";
        String body = "Android saiid Hello";
        NM=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notify=new Notification(android.R.drawable.
                stat_notify_more,title,System.currentTimeMillis());
        PendingIntent pending=PendingIntent.getActivity(
                getApplicationContext(),0, new Intent(),0);
        notify.setLatestEventInfo(getApplicationContext(),subject,body,pending);
        NM.notify(0, notify);

     }

}