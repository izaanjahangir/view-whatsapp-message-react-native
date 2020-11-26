package com.viewwhatsappmessage.notification;

import android.content.pm.PackageManager;

import com.facebook.react.bridge.Callback;

import com.facebook.react.bridge.ReactApplicationContext;

import com.facebook.react.bridge.ReactContextBaseJavaModule;

import com.facebook.react.bridge.ReactMethod;

 
public class NotificationModule extends ReactContextBaseJavaModule

{
    private final ReactApplicationContext reactContext;
    
    public NotificationModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Notification";
    }

    @ReactMethod
    public void hasFlash(Callback successCallback, Callback errorCallback) {
        if (reactContext.getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)) {
            successCallback.invoke();
        }
        else {
            errorCallback.invoke();
        }

    }

}