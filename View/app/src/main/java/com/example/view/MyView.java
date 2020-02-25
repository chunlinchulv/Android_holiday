package com.example.view;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MyView extends View {

    Context m_context;
    public MyView(Context context) {
        super(context);
        m_context = context;
    }

    /**
     * 重写onDraw（）方法，在每次重新绘图时实现自主绘图
     * @param canvas
     */



    /*Paint paint6 = new Paint();
    Path path = new Path();                 //初始化Path对象
    {
        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
    }*/
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //设置画笔的基本属性
        /*Paint paint = new Paint();
        paint.setAntiAlias(true);           //抗锯齿功能
        paint.setColor(Color.RED);          //设置画笔的颜色
        paint.setStyle(Paint.Style.FILL);   //设置填充样式
        paint.setStrokeWidth(5);            //设置画笔宽度
        paint.setShadowLayer(10,15,15,Color.GREEN);     //设置阴影*/

        //设置画布背景颜色
        canvas.drawRGB(255,255,255);
        //画圆
        //canvas.drawCircle(190,200,150,paint);

        //画线
        Paint paint1 = new Paint();
        paint1.setColor(Color.GREEN);
        paint1.setStyle(Paint.Style.FILL);
        paint1.setStrokeWidth(5);

        //canvas.drawLine(100,100,200,200,paint1);

        //画多条线
        Paint paint2 = new Paint();
        paint2.setColor(Color.BLUE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setStrokeWidth(5);
        float []pts = {10,10,200,200,300,300,400,400};
        //canvas.drawLines(pts,paint2);

        //画点
        Paint paint3 = new Paint();
        paint3.setColor(Color.RED);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setStrokeWidth(50);

        //canvas.drawPoint(100,100,paint3);

        //多个点
        //canvas.drawPoints(pts,paint3);

        //画矩形
        Paint paint4 = new Paint();
        paint4.setColor(Color.RED);
        paint4.setStyle(Paint.Style.FILL);
        paint4.setStrokeWidth(5);

        //canvas.drawRect(10,10,100,100,paint4);
        //圆角矩形
        RectF rectF = new RectF(500,500,1000,800);
        //canvas.drawRoundRect(rectF,20,10,paint4);
        Paint paint5 = new Paint();
        paint5.setColor(Color.parseColor("#88880000"));
        paint5.setStyle(Paint.Style.FILL);
        paint5.setStrokeWidth(5);
        //canvas.drawRect(rectF,paint5);
        //canvas.drawOval(rectF,paint5);          //rectF是用来生成椭圆的矩形

        //画弧
        //canvas.drawArc(rectF,0,90,false,paint5);


        //画自定义图形
        /*Paint paint6 = new Paint();
        Path path = new Path();                 //初始化Path对象*/
        //canvas.drawPath(path,paint6);           //绘制出 path 描述的图形（心形），大功告成


        /**
         * 直线路径
         */
        /*Paint paint7 = new Paint();
        paint7.setColor(Color.RED);
        paint7.setStyle(Paint.Style.STROKE);//填充样式为描边
        paint7.setStrokeWidth(5);//描边的宽度
*/
        //Path path = new Path();
        /*path.moveTo(400,600);
        path.lineTo(700,600);
        path.lineTo(700,200);
        path.close();*/
        //canvas.drawPath(path,paint7);

        /**
         *矩形路径
         * 先创建两个大小一样的路径
         */
        //第一个逆向生成
        /*Path CCWRectPath = new Path();
        RectF rectF1 = new RectF(100,100,480,400);
        CCWRectPath.addRect(rectF1, Path.Direction.CCW);*/

        //第二个顺向生成
        /*Path CWRectPath = new Path();
        RectF rectF2 = new RectF(580,100,960,400);
        CWRectPath.addRect(rectF2,Path.Direction.CW);*/

        //画出这两个路径
        /*canvas.drawPath(CCWRectPath,paint7);
        canvas.drawPath(CWRectPath,paint7);*/

        //依据路径写出文字
        /*String text = "大江东去浪淘尽，千古风流人物";
        paint7.setColor(Color.BLUE);
        paint7.setTextSize(35);*/
        //canvas.drawTextOnPath(text,CCWRectPath,0,18,paint7);
        //canvas.drawTextOnPath(text,CWRectPath,0,18,paint7);

        /**
         * 圆角矩形路径
         */
        /*Path path = new Path();
        RectF rectF3 = new RectF(100,100,480,480);
        path.addRoundRect(rectF3,360,360, Path.Direction.CW);
        canvas.drawPath(path,paint7);*/

        /**
         * 圆形路径
         */
        /*Path path = new Path();
        path.addCircle(400,400,200, Path.Direction.CW);
        canvas.drawPath(path,paint7);*/

        /**
         * 椭圆路径
         */
        /*Path path = new Path();
        RectF rectF1 = new RectF(100,100,480,400);
        path.addOval(rectF1, Path.Direction.CW);
        canvas.drawPath(path,paint7);*/

        /**
         * 弧形路径
         */
        /*Path path = new Path();
        RectF rectF1 = new RectF(50,50,240,200);
        path.addArc(rectF1,0,100);
        canvas.drawPath(path,paint7);*/

        /**
         * 文字
         */
        Paint paint = new Paint();
        //普通设置
        /*paint.setStrokeWidth(5);//设置画笔宽度
        paint.setAntiAlias(true);//指定是否使用抗锯齿功能，如果使用会让绘图的速度变慢
        paint.setStyle(Paint.Style.STROKE);//设置绘图样式，对文字和集合图形都有效
        paint.setTextAlign(Paint.Align.CENTER);//设置文字对齐方式，取值：align.CENTER、
                                                // align.LEFT或align.RIGHT
        paint.setTextSize(12);//设置文字大小

        //样式设置
        paint.setFakeBoldText(true);//设置是否为粗体文字
        paint.setUnderlineText(true);//设置下划线
        paint.setTextSkewX((float) -0.25);//设置字体倾斜度，普通斜体字是-0.25
        paint.setStrikeThruText(true);//设置带有删除线效果

        //其他设置
        paint.setTextScaleX(2);//只会将水平方向拉伸，高度不会改变*/

        /**
         * 绘图1
         */
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
        paint.setTextSize(150);
        paint.setStyle(Paint.Style.STROKE);

        /*//绘图样式设置为填充
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("安河桥北，春林初绿",10,200,paint);

        //绘图样式设置为描边
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawText("安河桥北，春林初绿",10,400,paint);

        //绘图样式设置为填充且描边
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawText("安河桥北，春林初绿",10,600,paint);
*/
        /**
         * 文字样式设置及倾斜度政府
         */
        /*paint.setFakeBoldText(true);//设置为粗体字
        paint.setUnderlineText(true);//设置为下划线
        paint.setStrikeThruText(true);//设置为带有删除效果

        //设置水平倾斜度，普通斜体字是-0.25，可见往右斜
        paint.setTextSkewX((float)-0.25);
        canvas.drawText("安河桥北，春林初绿",10,200,paint);

        //水平倾斜为0.25，向左倾斜
        paint.setTextSkewX((float)0.25);
        canvas.drawText("安河桥北，春林初绿",10,400,paint);*/

        /**
         * 水平拉伸设置
         */
        //变通样式字体
        /*canvas.drawText("安河桥北，春林初绿",10,200,paint);

        //水平方向拉伸两倍
        paint.setTextScaleX((float)1.5);
        canvas.drawText("安河桥北，春林初绿",10,400,paint);*/


        /**
         * 指定个个文字的位置
         */
        /*float[] pos = new float[]{80,100,80,300,80,500,80,700};
        canvas.drawPosText("安河桥北",pos,paint);*/


        /**
         * 沿路径绘制
         */
        //String string = "君不见黄河之水天上来";

        //先创建两个相同的圆形路径
       /* Path circlePath1 = new Path();
        circlePath1.addCircle(220,200,180,Path.Direction.CCW);
        canvas.drawPath(circlePath1,paint);

        Path circlePath2 = new Path();
        circlePath2.addCircle(750,200,180,Path.Direction.CCW);
        canvas.drawPath(circlePath2,paint);

        paint.setColor(Color.BLUE);
        //
        canvas.drawTextOnPath(string,circlePath1,0,0,paint);
        //
        canvas.drawTextOnPath(string,circlePath2,80,30,paint);*/


        /**
         * 字体样式设置
         */
        /*String familyName = "宋体";
        Typeface font = Typeface.create(familyName,Typeface.NORMAL);
        paint.setTypeface(font);
        canvas.drawText("安河桥北，春林初绿",10,100,paint);*/


        /**
         * 自定义字体
         * 首先在Asset下建一个文件夹，命名为Fonts，然后将字体文件jian_luobo.ttf 放入其中
         */
        AssetManager manager = m_context.getAssets();//得到AssetManager
        Typeface typeface = Typeface.createFromAsset(manager,"fonts/ZiKuTangShiKeTi-2.ttf");
        paint.setTypeface(typeface);
        Log.v("manager",typeface.toString());
        canvas.drawText("安河桥北，春林初绿",10,100,paint);
    }
}
