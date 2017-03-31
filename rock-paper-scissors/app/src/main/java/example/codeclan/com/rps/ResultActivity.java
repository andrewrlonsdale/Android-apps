package example.codeclan.com.rps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 18/01/2017.
 */

public class ResultActivity extends AppCompatActivity{

    TextView resultText;
    TextView playerText;
    TextView computerText;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result);
        playerText = (TextView) findViewById(R.id.player_text);
        computerText = (TextView) findViewById(R.id.computer_text);
        resultText = (TextView) findViewById(R.id.result_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String player = extras.getString("player");
        String computer = extras.getString("computer");
        String result = extras.getString("result");

        playerText.setText(player);
        computerText.setText(computer);
        resultText.setText(result);

    }
}
