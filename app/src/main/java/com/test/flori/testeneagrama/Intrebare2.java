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

public class Intrebare2 extends Activity {

        RadioGroup rg2;
        RadioButton rb2;
        String return2=null;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.intrebare2);
            rg2=(RadioGroup)findViewById(R.id.rgroup2);
        }
        public String rbclick2 (View v)
        {
            Bundle extras = getIntent().getExtras();
            String return1=null;
            if (extras != null)
            {

                String value = extras.getString("new_return1");

                return1 = value;
            }

            int checkRbID2=rg2.getCheckedRadioButtonId();
            rb2 = (RadioButton) findViewById(checkRbID2);
            switch(checkRbID2)
            {
                case R.id.radioButton5:
                    return2=return1+"x";
                break;
                case R.id.radioButton6:
                    return2=return1+"y";
                    break;
                case R.id.radioButton7:
                    return2=return1+"z";
                    break;
            }
            return return2;
        }
        public void onSubmitClick(View v2)
        {
            Intent i=new Intent(Intrebare2.this, Rezultat.class);
            i.putExtra("rezultat",return2);
            startActivity(i);
        }
}
