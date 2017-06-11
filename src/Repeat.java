import java.util.Timer;
import java.util.TimerTask;


public class Repeat {

    Game game;
    Display gameDisplay;

    public Repeat(Game components, Display gameDisplay){
        this.game = components;
        this.gameDisplay = gameDisplay;
    }

    public void snakeTimer(){
        Timer timer = new Timer();
//        Game game = new Game();
//        Display  gameDisplay = new Display(game);
        String stage = Start.getStage();

        String home = Start.getHome();
        String play = Start.getPlay();
        String win = Start.getWin();
        String gameOver = Start.getGameOver();

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
}
