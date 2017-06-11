import java.util.Timer;
import java.util.TimerTask;


public class Repeat {


    Game game;
    Display gameDisplay;


    public Repeat(Game components, Display gameDisplay){
        this.game = components;
        this.gameDisplay = gameDisplay;
    }



    public void timerLevelOne(){

        Timer timer = new Timer();
        String stage = Start.getStage();

        String play = Start.getPlay();

        timer.schedule (new TimerTask() {

            @Override
            public void run() {

                if (stage == play){
                    game.update();

                }

                gameDisplay.repaint();
            }
        }, 0, 500);
    }

    public void timerLevelTwo(){


        Timer timer = new Timer();
        String stage = Start.getStage();

        String play = Start.getPlay();

        timer.schedule (new TimerTask() {

            @Override
            public void run() {

                if (stage == play){
                    game.update();

                }

                gameDisplay.repaint();
            }
        }, 0, 200);
    }
}
