package example.codeclan.com.rps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Intent intent;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = (Button)findViewById(R.id.rock_button); // casting to Butto
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorsButton= (Button)findViewById(R.id.scissors_button);

        intent = new Intent(MainActivity.this, ResultActivity.class);

        Log.d(getClass().toString(), "on create called");

    }

    public void onRockButtonPressed(View button){
        Log.d(getClass().toString(),"Rock button pressed");

        game = new Game();
        String randomChoice = game.getChoice();
        intent.putExtra("computer",randomChoice);
        intent.putExtra("player", "Rock");

        String result = game.run("Rock",randomChoice);

        intent.putExtra("result",result);

        startActivity(intent);

    }

    public void onPaperButtonPressed(View button){
        Log.d(getClass().toString(),"Paper button pressed");

        game = new Game();
        String randomChoice = game.getChoice();
        intent.putExtra("computer",randomChoice);
        intent.putExtra("player", "Paper");

        String result = game.run("Paper",randomChoice);

        intent.putExtra("result",result);

        startActivity(intent);

    }

    public void onScissorsButtonPressed(View button){
        Log.d(getClass().toString(),"Scissors button pressed");

        game = new Game();
        String randomChoice = game.getChoice();
        intent.putExtra("computer",randomChoice);
        intent.putExtra("player", "Scissors");

        String result = game.run("Scissors",randomChoice);

        intent.putExtra("result",result);

        startActivity(intent);

    }

}
