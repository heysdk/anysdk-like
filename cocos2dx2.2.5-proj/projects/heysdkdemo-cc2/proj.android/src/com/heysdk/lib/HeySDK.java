package com.heysdk.lib;

import android.content.Context;
import android.widget.Toast;

public class HeySDK {
	public Context mContext;
	public static HeySDK sHeySDK = new HeySDK();
	
	public static HeySDK getInstance() {
		return sHeySDK;
	}
	
	public void init(Context context) {
		mContext = context;
	}
	
	// �Զ���½������Ϸ���ؽ�����ü���
	public static void autologin() {
		//Toast.makeText(getInstance().mContext, "autologin",  Toast.LENGTH_LONG).show();
	}
}
