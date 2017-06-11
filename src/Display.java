import java.awt.*;
import javax.swing.*;
import java.util.LinkedList;



public class Display extends JPanel {

    String stage = Start.getHome();

    public Snake snake;
    public Food food;
    public Score score;


    String home = Start.getHome();
    String play = Start.getPlay();
    String win = Start.getWin();
    String gameOver = Start.getGameOver();

    int caseSize = 40;

    int l = 400;
    int L= 400;

    Display(Game game){
        this.snake = game.getSnake();
        this.food = game.getfood();
        this.score = game.getScore();

    }



    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        stage = Start.getStage();


        if (stage == play){
            drawGame(g);
        }
        else if (stage == gameOver){
            gameOver(g);
        }
        else if (stage == win){
            gameWin(g);
        }
    }

    public void gameWin(Graphics g) {

        g.drawString("Vous avez gagné !", 100, 100);
    }

    public void gameOver(Graphics g) {

        int result = score.getScore();

        g.drawString("GAME OVER !", 100, 100);
        g.drawString("Score = " + result, 100, 250);
    }

    public void drawGame(Graphics g) {

        /***Grille***/

        g.clearRect(0, 0, L, l);

        for (int y=0; y <= l ; y+= caseSize){
            g.drawLine(0, y, L, y);
        }

        for (int x=0; x <= L ; x+= caseSize){
            g.drawLine(x, 0, x, l);
        }

        /***Snake***/

        LinkedList<Case> caseList = snake.getCaseList();

        g.setColor(Color.BLACK);
        for (Case s : caseList) {
            g.fillRect(s.x * caseSize, s.y * caseSize , caseSize, caseSize);
        }

        /**Food***/

        g.setColor(new Color(110, 106, 161));

        int x = food.getX() * caseSize;
        int y = food.getY() * caseSize;

        g.fillRect(x+1, y+1, caseSize, caseSize);
    }

}

