package com.example.searchtwo;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class Cell_Nom1 extends Fragment {
    ImageView imageView;
    int myDataFromActivity;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frament_cell1,container,false);

        this.imageView = view.findViewById(R.id.picture);
        this.imageView.setImageResource(R.drawable.i);
        MainActivity activity = (MainActivity) getActivity();
        myDataFromActivity = activity.Cell_1();

        this.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (myDataFromActivity == 1) {
                   // Toast.makeText(getActivity(),myDataFromActivity,Toast.LENGTH_LONG).show();
                    imageView.setImageResource(R.drawable.bird);
                }
                if (myDataFromActivity == 2) {
                   // Toast.makeText(getActivity(),myDataFromActivity,Toast.LENGTH_LONG).show();
                    imageView.setImageResource(R.drawable.pinguin);
                }
                if (myDataFromActivity == 3) {
                   // Toast.makeText(getActivity(),myDataFromActivity,Toast.LENGTH_LONG).show();
                    imageView.setImageResource(R.drawable.racoon);
                }
                if (myDataFromActivity == 4) {
                   // Toast.makeText(getActivity(),myDataFromActivity,Toast.LENGTH_LONG).show();
                    imageView.setImageResource(R.drawable.catthum);
                }
                if (myDataFromActivity == 5) {
                   // Toast.makeText(getActivity(),myDataFromActivity,Toast.LENGTH_LONG).show();
                    imageView.setImageResource(R.drawable.demon);
                }
                if (myDataFromActivity == 6) {
                  //  Toast.makeText(getActivity(),myDataFromActivity,Toast.LENGTH_LONG).show();
                    imageView.setImageResource(R.drawable.svidetel);
                }
                if (myDataFromActivity == 7) {
                    //Toast.makeText(getActivity(),myDataFromActivity,Toast.LENGTH_LONG).show();
                    imageView.setImageResource(R.drawable.poc);
                }
                if (myDataFromActivity == 8) {
                   // Toast.makeText(getActivity(),myDataFromActivity,Toast.LENGTH_LONG).show();
                    imageView.setImageResource(R.drawable.knifeugroza);
                }
            }
        });


        return view;
    }
}
