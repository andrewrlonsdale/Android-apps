package example.codeclan.com.newc9eightball;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 17/01/2017.
 */
public class AnswersTest {

    ArrayList<String> testAnswers;


    @Before
    public void setUp() throws Exception {
        testAnswers = new ArrayList<String>();
        testAnswers.add("Yes!");
        testAnswers.add("That would be an ecumenical matter!");
    }

    @Test
    public void getAnswersTest() {
        Answers answers = new Answers();
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void createAnswersWithListTest()
    {
        Answers answers = new Answers(testAnswers);
        assertEquals(2, answers.getLength());
    }

    @Test
    public void getAnswerAtIndexTest()
    {
        Answers answers = new Answers(testAnswers);
        String result = answers.getAnswerAtIndex(1);
        assertEquals("That would be an ecumenical matter!", result);
    }

    @Test
    public void getAnswerTest() {
        Answers answers = new Answers(testAnswers);

        String answer = answers.getAnswer();

        System.out.println("The answer is... " + answer);
        assertNotNull(answer);
    }


    @Test
    public void addTest() {
        Answers answers = new Answers();

        int originalNumberOfAnswers = answers.getLength();
        answers.add("Yes");

        assertEquals(originalNumberOfAnswers + 1, answers.getLength());
    }

}