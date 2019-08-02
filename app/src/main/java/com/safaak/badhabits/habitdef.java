package com.safaak.badhabits;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Map;

public class habitdef extends AppCompatActivity {

    ImageView habiticon;
    EditText giveaname;
    SharedPreferences sharedPreferenceshabitsname;
    ArrayList<String> habitsname;
    public int mposition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habitdef);

        habiticon = findViewById(R.id.imageView);
        giveaname = findViewById(R.id.editText);

        habitsname = new ArrayList<>();
        sharedPreferenceshabitsname = this.getSharedPreferences("com.safaak.badhabits", Context.MODE_PRIVATE);
        Map<String, ?> habitsnamess = sharedPreferenceshabitsname.getAll();
        for (Map.Entry<String, ?> entry : habitsnamess.entrySet()){

            habitsname.add(entry.getValue().toString());
        }

    }

    public void selectanicon(View view){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.customdialog);


        ImageView imageViewCigarette, imageViewAlcohol, imageViewDrugs, imageViewGames, imageViewPorno, imageViewTelevision,
                imageViewFastfood, imageViewShopping, imageViewSugar, imageViewFacebook, imageViewTwitter, imageViewInstagram,
                imageViewYoutube, imageViewSwearing, imageViewLying;

        imageViewCigarette = dialog.findViewById(R.id.imageViewCigarette);
        imageViewAlcohol = dialog.findViewById(R.id.imageViewAlcohol);
        imageViewDrugs = dialog.findViewById(R.id.imageViewDrugs);
        imageViewGames = dialog.findViewById(R.id.imageViewGames);
        imageViewPorno = dialog.findViewById(R.id.imageViewPorno);
        imageViewTelevision = dialog.findViewById(R.id.imageViewTelevision);
        imageViewFastfood = dialog.findViewById(R.id.imageViewFastfood);
        imageViewShopping = dialog.findViewById(R.id.imageViewShopping);
        imageViewSugar = dialog.findViewById(R.id.imageViewSugar);
        imageViewFacebook = dialog.findViewById(R.id.imageViewFacebook);
        imageViewTwitter = dialog.findViewById(R.id.imageViewTwitter);
        imageViewInstagram = dialog.findViewById(R.id.imageViewInstagram);
        imageViewYoutube = dialog.findViewById(R.id.imageViewYoutube);
        imageViewSwearing = dialog.findViewById(R.id.imageViewSwearing);
        imageViewLying = dialog.findViewById(R.id.imageViewLying);

        imageViewCigarette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mposition = 1;
            }
        });

        imageViewAlcohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 2;
            }
        });

        imageViewDrugs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 3;
            }
        });

        imageViewGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 4;
            }
        });

        imageViewPorno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 5;
            }
        });

        imageViewTelevision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 6;
            }
        });

        imageViewFastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 7;
            }
        });

        imageViewShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 8;
            }
        });

        imageViewSugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 9;
            }
        });

        imageViewFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 10;
            }
        });

        imageViewTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 11;
            }
        });

        imageViewInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 12;
            }
        });

        imageViewYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 13;
            }
        });

        imageViewSwearing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 14;
            }
        });

        imageViewLying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mposition = 15;
            }
        });

        Button savebutton = dialog.findViewById(R.id.savebutton);
        Button cancelbutton = dialog.findViewById(R.id.cancelbutton);

        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mposition == 1)
                    habiticon.setImageResource(R.drawable.cigarette);
                else if (mposition == 2)
                    habiticon.setImageResource(R.drawable.alcohol);
                else if (mposition == 3)
                    habiticon.setImageResource(R.drawable.drugs);
                else if (mposition == 4)
                    habiticon.setImageResource(R.drawable.games);
                else if (mposition == 5)
                    habiticon.setImageResource(R.drawable.porno);
                else if (mposition == 6)
                    habiticon.setImageResource(R.drawable.television);
                else if (mposition == 7)
                    habiticon.setImageResource(R.drawable.fastfood);
                else if (mposition == 8)
                    habiticon.setImageResource(R.drawable.shopping);
                else if (mposition == 9)
                    habiticon.setImageResource(R.drawable.candy);
                else if (mposition == 10)
                    habiticon.setImageResource(R.drawable.facebook);
                else if (mposition == 11)
                    habiticon.setImageResource(R.drawable.twitter);
                else if (mposition == 12)
                    habiticon.setImageResource(R.drawable.instagram);
                else if (mposition == 13)
                    habiticon.setImageResource(R.drawable.youtube);
                else if (mposition == 14)
                    habiticon.setImageResource(R.drawable.swearing);
                else if (mposition == 15)
                    habiticon.setImageResource(R.drawable.tellalie);
                else{

                }


                dialog.dismiss();
            }
        });

        cancelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }





}
