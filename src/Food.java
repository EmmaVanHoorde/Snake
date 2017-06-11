

import java.util.Random;

public class Food {

    int x;
    int y;

    public Food(){

        newfood();
    }

    public Case newfood(){


        Random random = new Random();
        x = random.nextInt(10);
        y = random.nextInt(10);
        return new Case(x, y);

    }

    public int getX() {

        return x;
    }
    public int getY() {

        return y;
    }


    public Case getCase() {

        return new Case(x, y);
    }
}
