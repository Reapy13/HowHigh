package draw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.SurfaceHolder;

import java.util.logging.Logger;

import m2dl.com.howhigh.R;
import manager.GameItem;

/**
 * Created by etudiant on 16/03/18.
 */

public class RockDraw implements GameItem {

    private static final Logger LOGGER = Logger.getLogger(RockDraw.class.getName());

    private Bitmap bitmap;

    private int horizontal;

    private int vertical = -500;

    private int verticalModifier = 30;

    private SurfaceHolder holder;

    public RockDraw(Context context, int horizontal) {
        this.horizontal = horizontal;
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.rock);
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public void display(Canvas canvas) {
        vertical = vertical + verticalModifier;
        canvas.drawBitmap(bitmap, horizontal, vertical, null);
    }

    @Override
    public int getx() {
        return horizontal;
    }

    @Override
    public int gety() {
        return vertical;
    }
}
