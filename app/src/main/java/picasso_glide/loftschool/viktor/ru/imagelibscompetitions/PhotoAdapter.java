package picasso_glide.loftschool.viktor.ru.imagelibscompetitions;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import picasso_glide.loftschool.viktor.ru.imagelibscompetitions.image.ImageDownloader;
import picasso_glide.loftschool.viktor.ru.imagelibscompetitions.image.ImageInteractor;

/**
 * Created by Developer on 17.03.2018.
 */

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.PhotoHolder> {

    private List<String> photos;
    private ImageDownloader imageDownloader;

    public PhotoAdapter(Context context, List<String> photos) {
        this.photos = photos;
        imageDownloader = new ImageDownloader(context);
    }

    @Override
    public PhotoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Указываем родителя ViewGroup и создание элемента View использую нужный layout
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.photo_item,  parent, false);
        return new PhotoHolder(view);
    }

    @Override
    public void onBindViewHolder(PhotoHolder holder, int position) {
        String imageUrl = photos.get(position);
        imageDownloader.load(ImageInteractor.Flag.GLIDE, imageUrl, holder.imageView);
    }

    @Override
    public int getItemCount() {
        return  photos.size();
    }

    static class  PhotoHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;

        public PhotoHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image_photo);
        }
    }

}
