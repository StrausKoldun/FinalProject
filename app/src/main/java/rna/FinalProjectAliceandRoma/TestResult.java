package rna.FinalProjectAliceandRoma;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TestResult extends AppCompatActivity {

    String result;
    TextView testResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);

        result = getIntent().getExtras().getString("result");
        testResult = (TextView) findViewById(R.id.testResult);
        testResult.setText(result);

    }
}
