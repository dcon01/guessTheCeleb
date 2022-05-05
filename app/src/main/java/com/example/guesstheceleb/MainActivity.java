package com.example.guesstheceleb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



//        setContentView(R.layout.activity_main);
//        ImageManager imageManager = new ImageManager(this.getAssets(), "celebs");
//        ImageView imageView = findViewById(R.id.image);
//        imageView.setImageBitmap(imageManager.get(0));
//        AssetManager manager = getAssets();
//        try {
//            String [] names = manager.list("celebs");
//            System.out.println(Arrays.toString(names));
//
//            ImageView imageView = findViewById(R.id.image);
//
//            InputStream stream = manager.open("celebs/" + names[0]);
//            Bitmap bitmap = BitmapFactory.decodeStream(stream);
//
//            imageView.setImageBitmap(bitmap);
//
//        } catch (IOException e) {
//            System.out.println("Failed to get names");
//        }
//    }
//
//    class ImageManager {
//        private String assetPath;
//        private String[] imageNames;
//        private AssetManager assetManager;
//
//        ImageManager(AssetManager assetManager, String assetPath) {
//            this.assetPath = assetPath;
//            this.assetManager = assetManager;
//            try {
//                imageNames = assetManager.list(assetPath);
//            } catch (IOException e) {
//                imageNames = null;
//            }
//        }
//
//        Bitmap get(int i) {
//            try {
//
//                ImageView imageView = findViewById(R.id.image);
//                InputStream stream = assetManager.open(assetPath + "/" + imageNames[0]);
//                Bitmap bitmap = BitmapFactory.decodeStream(stream);
//                imageView.setImageBitmap(bitmap);
//                System.out.println("done");
//                return bitmap;
//            } catch (IOException e) {
//                System.out.println("Failed to get names");
//            }
//            return null; //cant see bitmap from here?
//        }
//    }
    }
}
