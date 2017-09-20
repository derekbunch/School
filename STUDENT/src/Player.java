import java.util.Random;

/**
 * Created by ijr5 on 2/15/2016.
 */
public class Player {
    private String name;
    private String guess;
    private int points;

    public Player(String playName) {
        name = playName;
        guess = "";
        points = 0;

    }

    public void makeGuess(){
        Random rand = new Random();
        int guessNumber = rand.nextInt(2);

        if (guessNumber == 0)
            guess = "Cho (even)";
        else
            guess = "Han (odd)";


    }

    public void addPoints(int newPoints){
        points += newPoints;
    }

    public String getName() {
        return name;
    }

    public String getGuess() {
        return guess;
    }

    public int getPoints() {
        return points;
    }
}
