package picasso_glide.loftschool.viktor.ru.imagelibscompetitions.image;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Developer on 17.03.2018.
 */

public class GetterImages {

    List<String> imageUrls;

    public GetterImages() {
        imageUrls = new ArrayList<>();
        createImages();
    }

    private void createImages(){
            imageUrls.add("https://artpostergallery.ru/userdata/image/thumbs/a0/e8/a0e8f71bfd28534968d2826c117f2eaf_2.jpg");
            imageUrls.add("https://www.elinext.com/wp-content/uploads/2015/08/JAVA-AS-THE-INTERNET-OF-THINGS-PLATFORM-big.jpg");
            imageUrls.add("https://fossbytes.com/wp-content/uploads/2017/09/Kotlin-programming-language-course.png");
            imageUrls.add("https://www.wallpaperup.com/uploads/wallpapers/2012/11/05/21507/913928080117b72ba4e78b883ea59011.jpg");
            imageUrls.add("https://des.chinabrands.com/uploads/pdm-desc-pic/Distribution/image/2016/07/21/20160721140046_75867.jpg");
            imageUrls.add("https://w-dog.ru/wallpaper/luisa-girl-devushka-sensual-volosy-hair-vzglyad-glaza-pretty-eyes/id/240161/?FS=1");
            imageUrls.add("https://static.tumblr.com/e3e9229683bff3a079cfbc59eb58db10/l6mjitl/bv4n1f63h/tumblr_static_177509780.jpg");

    }

    public List<String> getImageUrls(){
        return imageUrls;
    }
}
