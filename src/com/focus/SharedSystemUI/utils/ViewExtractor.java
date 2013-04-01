package com.focus.SharedSystemUI.utils;

import android.content.Context;
import android.view.View;

public final class ViewExtractor {

	private static final String TYPE_LAYOUT = "layout";

	public static View getLayoutByName(Context context, String layoutName) {

		View view = null;
		int resId = getLayoutResByName(context, layoutName);
		if (resId != 0) {
			view = View.inflate(context, resId, null);
		}

		return view;
	}

	public static int getLayoutResByName(Context context, String layoutName) {
		return context.getResources().getIdentifier(layoutName, TYPE_LAYOUT,
				context.getPackageName());
	}
}
