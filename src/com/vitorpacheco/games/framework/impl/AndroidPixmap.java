package com.vitorpacheco.games.framework.impl;

import android.graphics.Bitmap;

import com.vitorpacheco.games.framework.Graphics.PixmapFormat;
import com.vitorpacheco.games.framework.Pixmap;

public class AndroidPixmap implements Pixmap {
	Bitmap bitmap;
	PixmapFormat format;

	public AndroidPixmap(Bitmap bitmap, PixmapFormat format) {
		this.bitmap = bitmap;
		this.format = format;
	}

	@Override
	public int getWidth() {
		return bitmap.getWidth();
	}

	@Override
	public int getHeight() {
		return bitmap.getHeight();
	}

	@Override
	public PixmapFormat getFormat() {
		return format;
	}

	@Override
	public void dispose() {
		bitmap.recycle();
	}
}