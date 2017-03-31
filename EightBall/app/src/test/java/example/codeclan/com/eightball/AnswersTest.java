package example.codeclan.com.eightball;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

/**
 * Created by user on 16/01/2017.
 */
public class AnswersTest {

    Answers answers;

    @Before
    public void before(){
        answers = new Answers();
    }

    @Test
    public  void  getAnswersTest(){
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void getLength(){
        assertEquals(3, answers.getLength());
    }

    @Test
    public void getAnswerAtIndexTest(){
        assertEquals("Yes", answers.getAnswerAtIndex(0));
    }

    @Test
    public void addAnswer(){
        answers.addAnswer("Bob");
        assertEquals(4, answers.getLength());
    }

    @Test
    public void getAnswer(){
        String answer = answers.getAnswer();
        System.out.println(answer);
        assertNotNull(answer);
    }

}


