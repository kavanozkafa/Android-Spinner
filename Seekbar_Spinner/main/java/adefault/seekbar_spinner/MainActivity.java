package adefault.seekbar_spinner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView renk;
    SeekBar red;
    SeekBar blue;
    SeekBar green;
    Spinner bolge;
    Spinner sehir;

    int redValue;
    int greenValue;
    int blueValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        renk=(TextView) findViewById(R.id.txtRenk);

        red = (SeekBar)findViewById(R.id.skred);
        blue = (SeekBar)findViewById(R.id.skblue);
        green= (SeekBar)findViewById(R.id.skgreen);
        redValue  = red.getProgress();
        greenValue  = green.getProgress();
        blueValue  = blue.getProgress();

        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                redValue = i;

                renk.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
                renk.setText("Red:"+redValue+"\n"+"Green:"+greenValue+"\n"+"Blue:"+blueValue);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

       green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        greenValue = i;

        renk.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
        renk.setText("Red:"+redValue+"\n"+"Green:"+greenValue+"\n"+"Blue:"+blueValue);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});

       blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        blueValue = i;

        renk.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
        renk.setText("Red:"+redValue+"\n"+"Green:"+greenValue+"\n"+"Blue:"+blueValue);

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});






        bolge = (Spinner)findViewById(R.id.spBolge);
        sehir=  (Spinner)findViewById(R.id.spSehir);

        final String Bolgeler[]={"Marmara", "Ege"};
        final String Marmara[]={"İstanbul", "Bursa","Kocaeli","Tekirdağ"};
        final String Ege[]={"Aydın", "Muğla","Manisa"};

      final   ArrayAdapter<String> SpinnerAdapBolge= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Bolgeler);
        final ArrayAdapter<String> SpinnerAdapMarmara= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Marmara);
       final ArrayAdapter<String> SpinnerAdapEge= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Ege);

        bolge.setAdapter(SpinnerAdapBolge);

        bolge.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            if (i==0)
            {
             //   ArrayAdapter<String> SpinnerAdapEge= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Marmara);

                sehir.setAdapter(SpinnerAdapMarmara);

            }

                else
            {
               // ArrayAdapter<String> SpinnerAdapEge= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Ege);
                sehir.setAdapter(SpinnerAdapEge);
            }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

   }
}
