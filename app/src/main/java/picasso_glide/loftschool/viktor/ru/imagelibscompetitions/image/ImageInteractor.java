package picasso_glide.loftschool.viktor.ru.imagelibscompetitions.image;

import android.support.annotation.IntDef;
import android.widget.ImageView;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Developer on 17.03.2018.
 */

public interface ImageInteractor {

    @IntDef({Flag.PICASSO, Flag.GLIDE})
    @Retention(RetentionPolicy.SOURCE)
    @interface Flag{
        int PICASSO = 0;
        int GLIDE = 1;
    }

    void load(@Flag int flag, String imgUrl, ImageView targett);
}
