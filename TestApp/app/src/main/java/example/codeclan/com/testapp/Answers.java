package example.codeclan.com.testapp;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 17/01/2017.
 */
public class Answers {


    private ArrayList<String> answers;

    public Answers() {
        answers = new ArrayList<String>();
        setupAnswers();
    }

    public Answers(ArrayList<String> someAnswers) {
        answers = new ArrayList<String>(someAnswers);
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<String>(answers);
    }

    public void add(String answer) {
        answers.add(answer);
    }

    public int getLength() {
        return answers.size();
    }

    public String getAnswerAtIndex(int index) {
        return answers.get(index);
    }

    public String getAnswer() {
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String answer = getAnswerAtIndex(index);
        return answer;
    }

    private void setupAnswers() {
        String[] answersToAdd = {
                "Yes!",
                "It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes, definitely",
                "You may rely on it",
                "As I see it, yes",
                "Most likely",
                "Outlook good",
                "Yes",
                "Signs point to yes",
                "Reply hazy try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                "Don't count on it",
                "My reply is no",
                "My sources say no",
                "Outlook not so good",
                "Very doubtful"
        };

        for (String answer : answersToAdd) {
            add(answer);
        }
    }
}
