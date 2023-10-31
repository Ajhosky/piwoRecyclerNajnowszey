package com.example.piwo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

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


        adapter = new Adapter(dataSet, dataSetnames);


        addButton = findViewById(R.id.button);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> beerToDisplay = new ArrayList<>();
                String selectedBeer = spinner.getSelectedItem().toString();
                beerToDisplay = BeerExpert.recommend(selectedBeer);
                for(int i = 0; i<beerToDisplay.size(); i++){
                    int image =
                    adapter.addElement(,beerToDisplay.get(i));
                }


            }
        });
    }
}
