package toong.vn.androidanimations.slide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import toong.vn.androidanimations.AnimationUtil;
import toong.vn.androidanimations.R;

public class SlideActivity extends AppCompatActivity {
    private boolean animationUsingXML = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        findViewById(R.id.slide_in_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (animationUsingXML) {
                    Animation animation = AnimationUtils.loadAnimation(SlideActivity.this,
                            R.anim.anim_slide_in_left);
                    v.startAnimation(animation);
                } else {
                    AnimationUtil.createSlideInLeftAnimation(v, null, v.getWidth()).start();
                }
            }
        });

        findViewById(R.id.slide_in_right).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(SlideActivity.this,
                        R.anim.anim_slide_in_right);
                v.startAnimation(animation);
            }
        });

        findViewById(R.id.slide_out_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(SlideActivity.this,
                        R.anim.anim_slide_out_left);
                v.startAnimation(animation);
            }
        });

        findViewById(R.id.slide_out_right).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(SlideActivity.this,
                        R.anim.anim_slide_out_right);
                v.startAnimation(animation);
            }
        });
    }
}
