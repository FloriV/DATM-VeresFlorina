package com.test.flori.testeneagrama;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Flori on 2/13/2017.
 */

public class Intrebare1 extends Activity {

    RadioGroup rg;
    RadioButton rb;
    String return1=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intrebare1);
        rg=(RadioGroup)findViewById(R.id.rgroup);
    }
    public String rbclick (View v)
    {
        int checkRbID=rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(checkRbID);
        switch(checkRbID)
        {
            case R.id.radioButton2:
                return1="a";
                break;
            case R.id.radioButton3:
                return1="b";
                break;
            case R.id.radioButton4:
                return1="c";
                break;
        }
        return return1;
    }
    public void onNextClick(View v1)
    {
        Intent i=new Intent(Intrebare1.this, Intrebare2.class);
        i.putExtra("new_return1",return1);
        startActivity(i);
    }
}
