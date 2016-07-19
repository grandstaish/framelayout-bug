package nz.bradcampbell.framelayoutbugdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SomeView extends ImageView {
    public SomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
