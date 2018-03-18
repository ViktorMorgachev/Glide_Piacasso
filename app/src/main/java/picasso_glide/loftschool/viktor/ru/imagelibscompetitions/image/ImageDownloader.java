package picasso_glide.loftschool.viktor.ru.imagelibscompetitions.image;


import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.squareup.picasso.Picasso;

import picasso_glide.loftschool.viktor.ru.imagelibscompetitions.R;

/**
 * Created by Developer on 17.03.2018.
 */

public class ImageDownloader implements  ImageInteractor{

    private Context context;

    public ImageDownloader(Context context) {
        this.context = context;
    }


    private  void loadWithGlide(String imgUrl, ImageView target){
        Glide.with(context)
                .load(imgUrl)
                .override(745, 810)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.mipmap.ic_launcher)
                .into(target);
    }

    private void  loadWithPicasso(String imgUrl, ImageView target) {
        Picasso.with(context)
                .load(imgUrl)
                .resize(745, 810)
                .placeholder(R.mipmap.ic_launcher_round)
                .into(target);

    }

    @Override
    public void load(int flag, String imgUrl, ImageView target) {

        switch (flag){
            case Flag.PICASSO:
                loadWithPicasso(imgUrl, target);
                break;
            case Flag.GLIDE:
                loadWithGlide(imgUrl, target);
                break;
        }

    }

    public void clearDiskCasheGlide(){
        Glide.get(context).clearDiskCache();
    }
}
