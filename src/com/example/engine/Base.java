package com.example.engine;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Base {
	
	int type;
	
	static final int TYPE_POINT = 0;
	static final int TYPE_LINE = 1;
	static final int TYPE_POLYLINE = 2;
	static final int TYPE_SQUARE = 3;
	static final int TYPE_CIRCLE = 4;
	static final int TYPE_SIMPLE_SPRITE = 5;
	
	public abstract void draw(Canvas c, Paint p);

	public int getType() {
		return type;
	}

	public abstract boolean isSelected(); 	
	
}
