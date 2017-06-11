
public class Score {

    protected int score;
    protected int increase;

    public Score(){
        score = 0;
        increase = 1;
    }

    public void resetScore() {

        score = 0;
    }

    public void increaseScore() {

        score += increase;
    }


    public int getScore() {
        return score;
    }


}