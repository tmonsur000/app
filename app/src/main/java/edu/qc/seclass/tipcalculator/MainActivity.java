package edu.qc.seclass.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView3;
    private TextView textView4;
    private TextView textView6;
    private TextView textView10;
    private TextView textView12;
    private TextView textView11;
    private TextView textView9;
    private TextView textView7;
    private TextView textView5;
    private EditText partySizeValue;
    private EditText checkAmountValue;
    private EditText fifteenPercentTipValue;
    private EditText twentyPercentTipValue;
    private EditText twentyfivePercentTipValue;
    private EditText fifteenPercentTotalValue;
    private EditText twentyPercentTotalValue;
    private EditText twentyfivePercentTotalValue;
    private Button buttonCompute;

    private double tip15, tip20, tip25;
    private double total15,total20, total25;
    private int partysize;
    private double initialbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView6=findViewById(R.id.textView6);
        textView10=findViewById(R.id.textView10);
        textView12=findViewById(R.id.textView12);
        textView11=findViewById(R.id.textView11);
        textView9=findViewById(R.id.textView9);
        textView7=findViewById(R.id.textView7);
        textView5=findViewById(R.id.textView5);
        partySizeValue=findViewById(R.id.partySizeValue);
        checkAmountValue=findViewById(R.id.checkAmountValue);
        fifteenPercentTipValue=findViewById(R.id.fifteenPercentTipValue);
        twentyPercentTipValue=findViewById(R.id.twentyPercentTipValue);
        twentyfivePercentTipValue=findViewById(R.id.twentyfivePercentTipValue);
        fifteenPercentTotalValue=findViewById(R.id.fifteenPercentTotalValue);
        twentyPercentTotalValue=findViewById(R.id.twentyPercentTotalValue);
        twentyfivePercentTotalValue=findViewById(R.id.twentyfivePercentTotalValue);
        buttonCompute=findViewById(R.id.buttonCompute);



        buttonCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkAmountValue.getText().toString().equals("")||checkAmountValue.getText().toString().isEmpty()){

                    Toast.makeText(getApplicationContext(), "Please enter a valid number for check amount", Toast.LENGTH_LONG).show();
                    return;
                }

                initialbill= Integer.parseInt(checkAmountValue.getText().toString());
                if (partySizeValue.getText().toString().equals("") || partySizeValue.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please enter a valid number for party size", Toast.LENGTH_LONG).show();
                    return;}

                partysize= Integer.parseInt(partySizeValue.getText().toString());

                tip15=((initialbill)/((partysize))*.15);
                fifteenPercentTipValue.setText((String.valueOf(String.format("%.2f", tip15))));
                tip20=((initialbill)/((partysize))*.20);
                twentyPercentTipValue.setText((String.valueOf(String.format("%.2f", tip20))));
                tip25=((initialbill)/((partysize))*.25);
                twentyfivePercentTipValue.setText((String.valueOf(String.format("%.2f", tip25))));

                total15=((initialbill/partysize)+tip15);
                fifteenPercentTotalValue.setText((String.valueOf(String.format("%.2f", total15))));
                total20=((initialbill/partysize)+tip20);
                twentyPercentTotalValue.setText((String.valueOf(String.format("%.2f", total20))));
                total25=((initialbill/partysize)+tip25);
                twentyfivePercentTotalValue.setText((String.valueOf(String.format("%.2f", total25))));

            }
        });


        }
    }

