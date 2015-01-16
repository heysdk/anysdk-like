package com.heysdk.lib;

import com.qvod.pay.PayListener;
import com.qvod.pay.PayUtil;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

public class HeySDK {
	public Context mContext;
	public static HeySDK sHeySDK = new HeySDK();
	
	public static HeySDK getInstance() {
		return sHeySDK;
	}
	
	public void init(Context context) {
		mContext = context;
		
		mHandler = new Handler() {
	        public void handleMessage(Message msg) {
	        	
	        	autologinimp();
	        	
	        	super.handleMessage(msg);   
	        }   
	   };   
	}
	
	// 自动登陆，在游戏加载界面调用即可
	public static void autologin() {
    	Message msg = new Message();
        msg.arg1 = -1;
        getInstance().mHandler.sendMessage(msg);
	}
	
	protected Handler mHandler;
   
   public void autologinimp() {
		PayUtil.getInstance().autoLogin(mContext, new PayListener() {

			@Override
			public void onSidReceive(String sid) {
			}
			
		}, "6001000");	   
   }
	
}
