package in.co.matchboxmedia.noopuram;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by mrkai on 15/3/18.
 */

public class noopuram extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
