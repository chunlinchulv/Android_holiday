package com.example.view2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.os.Build;
import android.view.View;

import androidx.annotation.RequiresApi;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //初始化画笔
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        //Region的基本构造
        /*Region region = new Region(10,10,100,100);*/
        //Region的间接构造
        /*region.set(100,100,400,200);//开启set()函数，覆盖掉原来的区域
        drawRegion(canvas,region,paint);*/

        /**
         * 使用setPath（）构造不规则区域
         */
        //构造一个椭圆路径
       /* Path ovalPath = new Path();
        RectF rectF = new RectF(100,100,400,1000);
        ovalPath.addOval(rectF, Path.Direction.CCW);
        //setPath时传入一个比椭圆区域小的矩形区域，让其取交集
        Region region = new Region(100,100,400,1000);
        region.setPath(ovalPath,region);
        //画出路径
        drawRegion(canvas,region,paint);*/

        /**
         * 矩形集枚举区域——RegionIterator类
         * 对于特定的区域，我们都可以使用多个矩形来表示其大致形状。事实上，如果矩形足够小，一定数量的
         * 矩形就能够精确表示区域的形状，也就是说，一定数量的矩形所合成的形状，也可以代表区域的形状。
         * RegionIterator类，实现了获取组成区域的矩形集的功能，其实RegionIterator类非常简单，总共就
         * 两个函数，一个构造函数和一个获取下一个矩形的函数；
         */


        /**
         * 区域的合并、交叉等操作
         */

        //两个相交叉的矩形
        Rect rect1 = new Rect(100,100,400,200);
        Rect rect2 = new Rect(200,0,300,300);
        canvas.drawRect(rect1,paint);
        canvas.drawRect(rect2,paint);

        //构造两个Region
        Region region1 = new Region(rect1);
        Region region2 = new Region(rect2);

        //获取两个区域的交集
        region1.op(region2, Region.Op.INTERSECT);

        //构造画笔填充交集
        Paint paint_fill = new Paint();
        paint_fill.setColor(Color.GREEN);
        paint_fill.setStyle(Paint.Style.FILL);
        drawRegion(canvas,region1,paint_fill);
    }

    private void drawRegion(Canvas canvas, Region region, Paint paint) {
        RegionIterator iterator = new RegionIterator(region);
        Rect rect = new Rect();
        while(iterator.next(rect)) {
            canvas.drawRect(rect,paint);
        }
    }
}
