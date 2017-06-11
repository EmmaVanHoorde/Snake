import java.util.LinkedList;

public class Snake {

    String home = Start.getHome();
    String play = Start.getPlay();
    String win = Start.getWin();
    String gameOver = Start.getGameOver();

    LinkedList<Case> caseList;


    Coordinates left = new Coordinates(-1, 0);
    Coordinates right = new Coordinates(1, 0);
    Coordinates top = new Coordinates(0, -1);
    Coordinates bottom = new Coordinates(0, 1);

    Coordinates direction;
    Coordinates thisDirection;

    boolean grow = false;
    int X, Y;

    public Snake(){

        createStartSnake();
    }

    public void createStartSnake(){

        caseList = new LinkedList<>();
        caseList.add(new Case(5, 5));
        caseList.add(new Case(6, 5));
        caseList.add(new Case(7, 5));

        direction = left;
        thisDirection = left;

        grow = false;
    }

    public LinkedList<Case> getCaseList(){

        LinkedList<Case> newCaseList = new LinkedList<Case>();

        for (Case i : caseList) {
            newCaseList.add(new Case(i.x, i.y));
        }
        return newCaseList;
    }

    public void eating() {
        grow = true;
    }

    public void snakeTop(){
        direction = top;
    }
    public void snakeBottom(){
        direction = bottom;
    }
    public void snakeLeft(){

        direction = left;
    }
    public void snakeRight(){

        direction = right;
    }


    protected void move(){

        if (direction == left && thisDirection == right) {
            direction = right;
        }
        if (direction == right && thisDirection == left) {
            direction = left;
        }
        if (direction == top && thisDirection == bottom) {
            direction = bottom;
        }
        if (direction == bottom && thisDirection == top) {
            direction = top;
        }

        Case firstCase = caseList.getFirst();
        int firstX = firstCase.x;
        int firstY = firstCase.y;


        Case newCase = new Case(firstCase.x + direction.getX(), firstCase.y + direction.getY());


        if (firstX >= 12 || firstY < 0 || firstX < 0 || firstY >= 12) {
            Start.setStage(gameOver);
            return;
        }

        if (meet(newCase)) {
            Start.setStage(Start.gameOver);
            return;
        }

        caseList.add(0, newCase);

        if (wonGame()) {
            Start.setStage(Start.win);
            return;
        }

        if (grow == false) {
            caseList.removeLast();
        }

        thisDirection = direction;
        grow = false;

    }


    public boolean meet(Case bodyCase) {

        for (Case i : caseList) {
            if (i.x == bodyCase.x && i.y == bodyCase.y) {
                return true;
            }
        }
        return false;
    }

    public boolean wonGame() {

        if (caseList.size() == (20)) {
            return true;
        }
        return false;
    }

}


