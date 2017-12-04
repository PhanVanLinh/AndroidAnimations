package toong.vn.androidanimations;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by PhanVanLinh on 04/12/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class AnimationUtil {

    public static ObjectAnimator createSlideInLeftAnimation(View view, AnimatorListenerAdapter listener,
            float distance) {
        view.setTranslationX(distance);
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", 0);
        animator.removeAllListeners();
        if (listener != null) {
            animator.addListener(listener);
        }
        return animator;
    }
}
