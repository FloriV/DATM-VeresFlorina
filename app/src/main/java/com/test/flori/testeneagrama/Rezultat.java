package com.test.flori.testeneagrama;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Flori on 2/13/2017.
 */

public class Rezultat extends Activity{

    int rezultat=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rezultat);
        rezultat=afisareRezultat();
        TextView myTextView = (TextView) findViewById(R.id.mytextview);
        myTextView.setText(String.valueOf("Personalitatea ta este: " + rezultat));
    }

    public int afisareRezultat()
    {
        Bundle extras = getIntent().getExtras();
        String return2=null;
        if (extras != null)
        {
            String value = extras.getString("rezultat");
            return2 = value;
        }
        if (return2.contentEquals("ax"))
        {
            rezultat=7;
        }
        if (return2.contentEquals("ay"))
        {
            rezultat=8;
        }
        if (return2.contentEquals("az"))
        {
            rezultat=3;
        }
        else if (return2.contains("bx"))
        {
            rezultat=9;
        }
        else if (return2.contains("by"))
        {
            rezultat=4;
        }
        else if (return2.contains("bz"))
        {
            rezultat=5;
        }
        else if (return2.contains("cx"))
        {
            rezultat=2;
        }
        else if (return2.contains("cy"))
        {
            rezultat=6;
        }
        else if (return2.contains("cz"))
        {
            rezultat=1;
        }
return rezultat;
    }
}
