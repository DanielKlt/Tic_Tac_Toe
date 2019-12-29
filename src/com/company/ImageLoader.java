package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    static Image imgx,imgo;

    public ImageLoader(){
        try {
            imgx = ImageIO.read(new File("image/x.png"));
            imgo = ImageIO.read(new File("image/o.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
