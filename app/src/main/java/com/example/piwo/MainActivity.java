package com.example.piwo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private Adapter adapter;
    private List<Integer> dataSet;
    private List<String> dataSetnames;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner = findViewById(R.id.spinner);


        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 5));

        dataSet = new ArrayList<>();
        dataSetnames = new ArrayList<>();

//        List<Beer> beerList = new ArrayList<>();
//        beerList.add(new Beer("IPA", R.drawable.piwo1));
//        beerList.add(new Beer("Stout", R.drawable.piwo2));
//        beerList.add(new Beer("Pilsner", R.drawable.piwo3));
//        beerList.add(new Beer("Lager", R.drawable.piwo4));
//        beerList.add(new Beer("Wheat Beer", R.drawable.piwo5));
//        beerList.add(new Beer("Porter", R.drawable.piwo6));
//        beerList.add(new Beer("Sour Ale", R.drawable.piwo7));
//        beerList.add(new Beer("Amber Ale", R.drawable.piwo8));
//        beerList.add(new Beer("Pale Ale", R.drawable.piwo9));

        List<Integer> dataSet = new ArrayList<>();
        List<String> dataSetnames = new ArrayList<>();


//        for (Beer beer : beerList) {
//            dataSet.add(beer.getImageResource());
//            dataSetnames.add(beer.getName());
//        }





        addButton = findViewById(R.id.button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button rotateBtn = findViewById(R.id.rotateBtn);
        rotateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Animation rotate = AnimationUtils.loadAnimation(this, R.)
            }
        });
//        public void startRotationAnimation(View view) {
//            // Load the animation
//            Animation rotationAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
//
//            // Find the ImageView to apply the animation
//            Layout rotatingImageView = findViewById(R.id.item.xml);
//
//            // Start the animation
//            rotatingImageView.startAnimation(rotationAnimation);
//        }

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, Integer> beerToDisplay = new HashMap<String, Integer>();
                //Dictionary<String,Integer> beerToDisplay = new Hashtable<>();
                String selectedBeer = spinner.getSelectedItem().toString();
                beerToDisplay = BeerExpert.recommend(selectedBeer);

                adapter = new Adapter(dataSet, dataSetnames);

                for(String key : beerToDisplay.keySet()) {
                    int value = beerToDisplay.get(key);
                    Log.e("mainTest2",key + ": " + value);
                    adapter.addElement(value, key);

                }
                recyclerView.setAdapter(adapter);
            }
        });
    }
}
