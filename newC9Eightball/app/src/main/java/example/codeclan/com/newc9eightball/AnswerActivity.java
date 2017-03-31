package example.codeclan.com.newc9eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 17/01/2017.
 */

public class AnswerActivity extends AppCompatActivity {

    TextView answerText;
    TextView questionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_answer);
        answerText = (TextView)findViewById(R.id.answer_text);
        questionText = (TextView)findViewById(R.id.answer_question);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String answer = extras.getString("answer");
        String question = extras.getString("question");

        questionText.setText(question);

        answerText.setText(answer);

        Log.d(getClass().toString(), "Answer activity onCreate");
    }
}















