import javax.swing.*;


public class Start {

    public static Snake snake ;
    public static Game game;
    public static Score score;

    static String home = "home";
    static String play = "play";
    static String win = "win";
    static String gameOver = "start over";

    public static String stage = home;

    static JFrame window;
    static Display display;


    public static JFrame createWindow() {
        window = new JFrame();
        window.setSize(450, 400);
        window.setLocationRelativeTo(null);

        display = new Display(game);

        display.setFocusable(true);
        display.requestFocusInWindow();

        window.add(display);

        display.addKeyListener(new Keyboard(snake));
        setStage(home);

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

        //stage = home;
    }

    public static void newGame() {


        Repeat time = new Repeat(game, display);

        stage = play;
        game.newGame();
        time.snakeTimer();
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
}
