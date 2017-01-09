package animationutils.shiming.com.myapplication;

import android.app.Application;
import android.content.Context;


/**
 * Created by shiming on 2017/1/9.
 */
public class MyApplication extends Application {
    public Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext=this;

    }
    public  Context getContext(){
        return mContext;
    }
    private void initWindows() {

    }
}
