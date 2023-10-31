package com.example.piwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BeerExpert {


//
//
//    public static List<Beer> recommend( Beer chosenBeer, List<Beer> beerList){
//        List<Beer> recommendedBeer = new ArrayList<>();
//        Random rand = new Random();
//        int randomNum = 0;
//        List<Integer> chosenNumbers = new ArrayList<Integer>();
//        for (int i = 0; i < 4; i++){
//            if (chosenNumbers.contains(randomNum)){
//                randomNum = rand.nextInt(beerList.size()) -1;
//            }else{
//                chosenNumbers.add(randomNum);
//            }
//        }
//        recommendedBeer.add(beerList.get(randomNum));
//
//        return recommendedBeer;
//    }

    public static List<String> recommend(String chosenBeer){

        List<Beer> beerList = new ArrayList<>();
        beerList.add(new Beer("IPA", R.drawable.piwo1));
        beerList.add(new Beer("Stout", R.drawable.piwo2));
        beerList.add(new Beer("Pilsner", R.drawable.piwo3));
        beerList.add(new Beer("Lager", R.drawable.piwo4));
        beerList.add(new Beer("Wheat Beer", R.drawable.piwo5));
        beerList.add(new Beer("Porter", R.drawable.piwo6));
        beerList.add(new Beer("Sour Ale", R.drawable.piwo7));
        beerList.add(new Beer("Amber Ale", R.drawable.piwo8));
        beerList.add(new Beer("Pale Ale", R.drawable.piwo9));

        List<String> beerListNames = new ArrayList<>();
        beerListNames.add("IPA");
        beerListNames.add("Stout");
        beerListNames.add("Pilsner");
        beerListNames.add("Lager");
        beerListNames.add("Wheat Beer");
        beerListNames.add("Porter");
        beerListNames.add("Sour Ale");
        beerListNames.add("Amber Ale");
        beerListNames.add("Pale Ale");

        List<String> beerToRecommend = new ArrayList<>();
        for (String x: beerListNames) {
            if (x != chosenBeer){
                beerToRecommend.add(x);
            }
        }
        List<String> recommendedBeer = new ArrayList<>();

        Random rand = new Random();
        int randomNum = 0;
        List<Integer> chosenNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++){

            if (chosenNumbers.contains(randomNum)){
                randomNum = rand.nextInt(beerList.size()) -1;
            }else{
                chosenNumbers.add(randomNum);
            }
            recommendedBeer.add(beerToRecommend.get(randomNum));
        }

        return recommendedBeer;
    }
}
