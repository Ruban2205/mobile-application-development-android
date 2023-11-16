package in.rubangino.exploringintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView activityResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        activityResult = findViewById(R.id.activity_result);

        Intent intent = getIntent();

        String usrInput = intent.getStringExtra("user");

        activityResult.setText(usrInput);
    }
}