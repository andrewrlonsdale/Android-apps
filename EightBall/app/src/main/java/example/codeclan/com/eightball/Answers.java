package example.codeclan.com.eightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 16/01/2017.
 */
public class Answers implements Answerable{
    private ArrayList<String> answers;

    public Answers(){
        answers = new ArrayList<String>();
        setupAnswers();
    }

    public Answers(ArrayList<String> answers){
        answers = new ArrayList<String>(answers);
    }

    public ArrayList<String> getAnswers(){
        return new ArrayList<String>(answers);
    }

    public void addAnswer(String answer){
        answers.add(answer);
    }

    public int getLength(){
        return answers.size();
    }

    public String getAnswerAtIndex(int index){
        return answers.get(index);
    }

    public String getAnswer(){
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String answer = getAnswerAtIndex(index);
        return answer;
    }

    private void setupAnswers(){
        String[] answersToAdd = {
                "Yes",
                "No",
                "That would be an ecumenical matter"
        };
        for(String answer : answersToAdd){
            addAnswer(answer);
        }
    }

}


