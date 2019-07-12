package com.example.add;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText f;
    EditText s;
    TextView r;
    Button add;
    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f=(EditText)findViewById(R.id.fno);
        s=(EditText)findViewById(R.id.sno);
        add=(Button) findViewById(R.id.add_button);
        r=(TextView)findViewById(R.id.answer);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n=Double.parseDouble(f.getText().toString());
                double m=Double.parseDouble(s.getText().toString());
                double sum=n+m;
                r.setText(Double.toString(sum));
            }
        });
    }
}
