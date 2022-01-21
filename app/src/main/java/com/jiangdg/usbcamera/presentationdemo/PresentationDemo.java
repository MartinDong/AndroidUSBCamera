package com.jiangdg.usbcamera.presentationdemo;

import android.app.Presentation;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

import com.jiangdg.usbcamera.R;

/**
 * Created by Administrator on 2016/6/2.
 */
public class PresentationDemo extends Presentation {

    private Context mContext;
    private ImageView mFullScreenImage;

    public PresentationDemo(Context outerContext, Display display) {
        super(outerContext, display);
        mContext = outerContext;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presentation_content);
        mFullScreenImage = (ImageView) findViewById(R.id.full_screen_img);
    }

    public ImageView getImageView(){
        return mFullScreenImage;
    }
}
