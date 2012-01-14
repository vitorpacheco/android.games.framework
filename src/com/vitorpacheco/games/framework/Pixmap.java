package com.vitorpacheco.games.framework;

import com.vitorpacheco.games.framework.Graphics.PixmapFormat;

public interface Pixmap {
	public int getWidth();

	public int getHeight();

	public PixmapFormat getFormat();

	public void dispose();
}