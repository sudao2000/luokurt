package com.nostra13.universalimageloader.sample;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class DisplayUtil {
	public static int getScreenWidth(Context context) {
		DisplayMetrics metric = new DisplayMetrics();
		WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		wm.getDefaultDisplay().getMetrics(metric);
		return metric.widthPixels;
	}
	
	public static int getScreenHeight(Context context) {
		DisplayMetrics metric = new DisplayMetrics();
		WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		wm.getDefaultDisplay().getMetrics(metric);
		return metric.heightPixels;
	}
}
