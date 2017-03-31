package example.codeclan.com.rps;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 18/01/2017.
 */

public class Game {

    private ArrayList<String> choices;

    public Game(){
        choices = new ArrayList<String>();
        setUpGame();
    }

    public Game(ArrayList<String > someChoices) {choices = new ArrayList<String>(someChoices);}

    public ArrayList<String> getChoices(){ return new ArrayList<String>(choices);}

    public void add(String choice) { choices.add(choice);}

    public int getLength(){return choices.size();}

    public String getChoiceAtIndex(int index){return choices.get(index);}

    public String getChoice(){
        Random rand = new Random();
        int listSize=getLength();
        int index = rand.nextInt(listSize);
        String choice = getChoiceAtIndex(index);
        return choice;
    }

    private void setUpGame(){
        String[] computerToAdd ={
                "Rock",
                "Paper",
                "Scissors"
        };
        for(String choice: computerToAdd){
            add(choice);
        }
    }

    public String run(String player1, String computer1){

        String player = player1;
        String computer = computer1;

        if (player == computer){
            return "Draw";
        }
        else if((player == "Rock" && computer == "Scissors" )|| (player == "Paper" && computer == "Rock" ) || (player == "Scissors" && computer == "Paper" )) {
            return "You Win!";
        }
        else {
            return "Computer Wins";
        }
    }
}
