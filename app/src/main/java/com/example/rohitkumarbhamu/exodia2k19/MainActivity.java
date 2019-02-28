package com.example.rohitkumarbhamu.exodia2k19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.ic_launcher_background , R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};

    LinearLayout linearLayoutSponsers,linearLayoutWebsite,linearLayoutMap,linearLayoutAboutUs,linearLayoutContact_us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        linearLayoutAboutUs=findViewById(R.id.about_ll);
        linearLayoutSponsers=findViewById(R.id.sponsers_ll);
        linearLayoutContact_us=findViewById(R.id.contact_us_ll);
        linearLayoutMap=findViewById(R.id.map_ll);
        linearLayoutWebsite=findViewById(R.id.website_ll);



        //onclick listener on each linear layout
        linearLayoutWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VisitOurWebsite.class);
                startActivity(intent);
            }
        });
        linearLayoutContact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactUs.class);
                startActivity(intent);
            }
        });
        linearLayoutMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CampusMap.class);
                startActivity(intent);
            }
        });
        linearLayoutSponsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sponsors.class);
                startActivity(intent);
            }
        });
        linearLayoutAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutUs.class);
                startActivity(intent);
            }
        });




    }

    //This is for Carousel view
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

}
