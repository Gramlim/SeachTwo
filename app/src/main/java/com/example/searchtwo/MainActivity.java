package com.example.searchtwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements Adapter.ItemClickListener {
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        int[] data = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8};
        shuffleArray(data);
        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvNumbers);
        int numberOfColumns = 4;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        adapter = new Adapter(this, data);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public void onItemClick(View view, int position) {
        Log.i("TAG", "You clicked number " + adapter.getItem(position) + ", which is at cell position " + position);
    }
    static void shuffleArray(int[] ar) {
        Random rnd = new Random();
       for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
//    int i[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        shuffleArray(i);
//        setContentView(R.layout.activity_main);
//    }
//    static void shuffleArray(int[] ar) {
//        Random rnd = new Random();
//        for (int i = ar.length - 1; i > 0; i--) {
//            int index = rnd.nextInt(i + 1);
//            // Simple swap
//            int a = ar[index];
//            ar[index] = ar[i];
//            ar[i] = a;
//        }
//    }
//    public Integer Cell_1(){
//        return Integer.valueOf(i[0]);
//    }
//    public Integer Cell_2(){
//        return Integer.valueOf(i[1]);
//    }
//    public Integer Cell_3(){
//        return Integer.valueOf(i[2]);
//    }
//    public Integer Cell_4(){
//        return Integer.valueOf(i[3]);
//    }
//    public Integer Cell_5(){
//        return Integer.valueOf(i[4]);
//    }
//    public Integer Cell_6(){
//        return Integer.valueOf(i[5]);
//    }
//    public Integer Cell_7(){
//        return Integer.valueOf(i[6]);
//    }
//    public Integer Cell_8(){
//        return Integer.valueOf(i[7]);
//    }
//    public Integer Cell_9(){
//        return Integer.valueOf(i[8]);
//    }
//    public Integer Cell_10(){
//        return Integer.valueOf(i[9]);
//    }
//    public Integer Cell_11(){
//        return Integer.valueOf(i[10]);
//    }
//    public Integer Cell_12(){
//        return Integer.valueOf(i[11]);
//    }
//    public Integer Cell_13(){
//        return Integer.valueOf(i[12]);
//    }
//    public Integer Cell_14(){
//        return Integer.valueOf(i[13]);
//    }
//    public Integer Cell_15(){
//        return Integer.valueOf(i[14]);
//    }
//    public Integer Cell_16(){
//        return Integer.valueOf(i[15]);
//    }
}

//Handler handler = new Handler();
//                    handler.postDelayed(new Runnable() {
//                        public void run() {
//                            /*code*/
//                            imageView.setImageResource(R.drawable.i);
//                                    }
//                                    }, 2000);