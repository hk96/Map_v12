package agersense.map_v1;

import android.media.Image;

/**
 * Created by HK on 03-Jul-17.
 */

public class DataBean {

    private String mText1;
    private String mText2;
    Image img;



    DataBean (String text1, String text2, Image image){
        mText1 = text1;
        mText2 = text2;
        img = image;
    }
    public String getmText1() {
        return mText1;
    }
    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }
    public String getmText2() {
        return mText2;
    }
    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }
    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}
