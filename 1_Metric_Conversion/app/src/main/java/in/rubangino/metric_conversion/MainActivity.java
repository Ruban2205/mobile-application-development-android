package in.rubangino.metric_conversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userInput;
    Button calculateButton;
    TextView resultInMeter, resultInKm, resultInMM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);

        userInput = findViewById(R.id.user_input);
        calculateButton = findViewById(R.id.calculate_btn);

        resultInMeter = findViewById(R.id.result_in_m);
        resultInKm = findViewById(R.id.result_in_km);
        resultInMM = findViewById(R.id.result_in_mm);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                // Get the input in string
                // Convert the string to int
                // Do the required operations
                // Convert back to string
                // Set the text in result

                String cmInput = userInput.getText().toString();

                Double cmInputTometer = (Double) (Double.parseDouble(cmInput) * 0.01);
                Double cmInputToKm = (Double) (Double.parseDouble(cmInput) * 0.00001);
                int cmInputTomm = (int) (Integer.parseInt(cmInput) * 10);

                resultInMeter.setText("Centimeter to Meter: " + String.valueOf(cmInputTometer));
                resultInKm.setText("Centimeter to Kilometer: " + String.format("%.2f",cmInputToKm));
                resultInMM.setText("Centimeter to Milimeter: " + String.valueOf(cmInputTomm));
            }
        });
    }
}
