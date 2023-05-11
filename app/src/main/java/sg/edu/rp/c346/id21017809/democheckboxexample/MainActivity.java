package sg.edu.rp.c346.id21017809.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textViewShow);
        cbEnabled.setChecked(true);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbEnabled.isChecked()) {
                    tvShow.setText("The discount is given.");
                } else {
                    tvShow.setText("The discount is not given.");
                }
                Toast.makeText(MainActivity.this,"Button Click",
                        Toast.LENGTH_LONG).show();


            }
        });

    }
}