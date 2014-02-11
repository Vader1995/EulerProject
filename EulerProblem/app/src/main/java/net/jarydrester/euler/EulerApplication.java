package net.jarydrester.euler;

import android.app.Application;
import android.content.Context;

import dagger.ObjectGraph;

public class EulerApplication extends Application {

    private ObjectGraph dagger;

    @Override
    public void onCreate() {
        super.onCreate();
        dagger = ObjectGraph.create(new ApplicationModule());
    }

    public void inject(Object injectionPoint) {
        dagger.inject(injectionPoint);
    }

    public static void inject(Context context) {
        get(context).inject((Object)context);
    }

    public static EulerApplication get(Context context) {
        return (EulerApplication) context.getApplicationContext();
    }
}
