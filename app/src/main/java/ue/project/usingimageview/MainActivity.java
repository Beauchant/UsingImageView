package ue.project.usingimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.imageView);
        Button btnImage = findViewById(R.id.btnImage);

        ArrayList<Integer> images = new ArrayList<>();
        images.add(R.drawable.img1);
        images.add(R.drawable.img2);
        images.add(R.drawable.img4);
        images.add(R.drawable.img5);
        images.add(R.drawable.img6);
        images.add(R.drawable.img7);
        images.add(R.drawable.img9);
        images.add(R.drawable.img8);
        images.add(R.drawable.img10);
        images.add(R.drawable.img11);

        img.setImageResource(images.get(4));

        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int choice = rnd.nextInt(10);
                img.setImageResource(images.get(choice));
            }
        });
    }
}
