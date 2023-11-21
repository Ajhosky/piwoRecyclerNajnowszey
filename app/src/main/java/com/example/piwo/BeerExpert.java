package com.example.piwo;

import android.util.Log;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
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

    public static Map<String, Integer> recommend(String chosenBeer){

        Map<String, Integer> dict= new HashMap<String, Integer>();
        dict.put("IPA", R.drawable.piwo1);
        dict.put("Stout", R.drawable.piwo2);
        dict.put("Pilsner", R.drawable.piwo3);
        dict.put("Lager", R.drawable.piwo4);
        dict.put("Wheat Beer", R.drawable.piwo5);
        dict.put("Porter", R.drawable.piwo6);
        dict.put("Sour Ale", R.drawable.piwo7);
        dict.put("Amber Ale", R.drawable.piwo8);
        dict.put("Pale Ale", R.drawable.piwo9);


        /*List<Beer> beerList = new ArrayList<>();
        beerList.add(new Beer("IPA", R.drawable.piwo1));
        beerList.add(new Beer("Stout", R.drawable.piwo2));
        beerList.add(new Beer("Pilsner", R.drawable.piwo3));
        beerList.add(new Beer("Lager", R.drawable.piwo4));
        beerList.add(new Beer("Wheat Beer", R.drawable.piwo5));
        beerList.add(new Beer("Porter", R.drawable.piwo6));
        beerList.add(new Beer("Sour Ale", R.drawable.piwo7));
        beerList.add(new Beer("Amber Ale", R.drawable.piwo8));
        beerList.add(new Beer("Pale Ale", R.drawable.piwo9));*/

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

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.piwo1);
        imageList.add( R.drawable.piwo2);
        imageList.add( R.drawable.piwo3);
        imageList.add( R.drawable.piwo4);
        imageList.add( R.drawable.piwo5);
        imageList.add(R.drawable.piwo6);
        imageList.add( R.drawable.piwo7);
        imageList.add( R.drawable.piwo8);
        imageList.add(R.drawable.piwo9);

        List<String> beerToRecommend = new ArrayList<>();
        for (String x: beerListNames) {
            if (x != chosenBeer){
                beerToRecommend.add(x);
            }
        }
        Map<String, Integer> recommendedBeer= new HashMap<String,Integer>();
        //List<String> recommendedBeer = new ArrayList<>();

        Random rand = new Random();
        int randomNum = 0;
        List<Integer> chosenNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++){

            if (chosenNumbers.contains(randomNum)){
                randomNum = rand.nextInt(beerListNames.size());
            }else{
                chosenNumbers.add(randomNum);
            }
            //Log.e("test1" , recommendedBeer.toString());
            //Log.e("test1" , beerToRecommend.get(randomNum));

            recommendedBeer.put(beerToRecommend.get(randomNum),imageList.get(randomNum) );
        }

        return (Map<String, Integer>) recommendedBeer;
    }


//    public static List<Integer> recommendImg(Integer chosenBeer){
//
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
//
//        List<Integer> imageList = new ArrayList<>();
//        imageList.add(R.drawable.piwo1);
//        imageList.add( R.drawable.piwo2);
//        imageList.add( R.drawable.piwo3);
//        imageList.add( R.drawable.piwo4);
//        imageList.add( R.drawable.piwo5);
//        imageList.add(R.drawable.piwo6);
//        imageList.add( R.drawable.piwo7);
//        imageList.add( R.drawable.piwo8);
//        imageList.add(R.drawable.piwo9);
//r
//
////        List<Integer> beerToRecommend = new ArrayList<>();
////        for (Integer x: imageList) {
////            if (x != chosenBeer){
////                beerToRecommend.add(x);
////            }
////        }
////        List<Integer> recommendedBeerImgs = new ArrayList<>();
////
////        Random rand = new Random();
////        int randomNum = 0;
////        List<Integer> chosenNumbers = new ArrayList<Integer>();
////        for (int i = 0; i < 4; i++){
////
////            if (chosenNumbers.contains(randomNum)){
////                randomNum = rand.nextInt(beerList.size()) -1;
////            }else{
////                chosenNumbers.add(randomNum);
////            }
////            recommendedBeer.add(beerToRecommend.get(randomNum));
////        }
//
//        return recommendedBeerImgs;
//    }
}
