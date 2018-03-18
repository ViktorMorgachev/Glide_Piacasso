package picasso_glide.loftschool.viktor.ru.imagelibscompetitions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import picasso_glide.loftschool.viktor.ru.imagelibscompetitions.image.GetterImages;

public class MainActivity extends AppCompatActivity {

    private GetterImages getterImages;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getterImages = new GetterImages();

        PhotoAdapter photoAdapter = new PhotoAdapter(this, getterImages.getImageUrls());
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_photos);

        if(recyclerView != null){

            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(photoAdapter);

        }
    }
}
