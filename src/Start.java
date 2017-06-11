import javax.swing.*;
import java.awt.*;


public class Start {

    public static Snake snake ;
    public static Game game;
    public static Score score;

    static String home = "home";
    static String play = "play";
    static String win = "win";
    static String gameOver = "game over";

    public static String stage = home;

    static JFrame window;
    static Display display;

    public static boolean level;


    public static JFrame createWindow() {
        window = new JFrame();
        window.setSize(420, 440);
        window.setLocationRelativeTo(null);
        display = new Display(game);

        display.setFocusable(true);
        display.requestFocusInWindow();

        window.add(display);

        display.addKeyListener(new Keyboard(snake));
        setStage(play);

        window.setVisible(true);

        return window;
    }


    public static void startGame() {

        game = new Game();
        snake = new Snake();
        Food food = new Food();
        game.addSnake(snake);
        game.addfood(food);

        score = new Score();

        game.addScore(score);

    }


    public static void newGame() {

        Repeat time = new Repeat(game, display);

        stage = play;
        game.newGame();


        if (level == false){
            time.timerLevelOne();
        }
        else if (level == true){
            time.timerLevelTwo();
        }
    }

    public static String getHome(){
        return home;
    }
    public static String getPlay(){
        return play;
    }
    public static String getGameOver(){
        return gameOver;
    }
    public static String getWin(){
        return win;
    }

    public static String getStage() {
        return stage;
    }

    public static void setStage(String stage) {
        Start.stage = stage;
    }

    public static boolean getLevel(){ return level; }

    public static void setLevel(boolean level) {
        Start.level = level;
    }
}
