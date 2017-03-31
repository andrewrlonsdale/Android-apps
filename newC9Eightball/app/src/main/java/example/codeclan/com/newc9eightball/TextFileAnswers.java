package example.codeclan.com.newc9eightball;

import android.util.Log;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by user on 18/01/2017.
 */

public class TextFileAnswers {

    private ArrayList<String> answers;
    private Scanner fileReader;

    public TextFileAnswers(InputStream fileData) {
        answers = new ArrayList<>();
        fileReader = new Scanner(fileData);
        setupAnswers();
    }

    private void setupAnswers() {
        boolean hasMoreLines = fileReader.hasNextLine();
        while (hasMoreLines) {
            String lineOfText = fileReader.nextLine();

            Log.d(getClass().toString(), lineOfText);
            answers.add(lineOfText);

            hasMoreLines = fileReader.hasNextLine();
        }
    }

    public String getAnswer(){
        Random rand = new Random();
        int arrayLength = answers.size();
        int randomIndex = rand.nextInt(arrayLength);
        String randomAnswer = answers.get(randomIndex);
        return randomAnswer;
    }
}
