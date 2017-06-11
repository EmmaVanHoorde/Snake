import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Keyboard implements KeyListener{

    Snake snake;

    Keyboard(Snake s){
        this.snake = s;
    }

    public void keyPressed(KeyEvent ev) {


        if (ev.getKeyCode() == KeyEvent.VK_LEFT) {
            snake.snakeLeft();
        }
        if (ev.getKeyCode() == KeyEvent.VK_RIGHT) {
            snake.snakeRight();
        }
        if (ev.getKeyCode() == KeyEvent.VK_UP) {
            snake.snakeTop();
        }
        if (ev.getKeyCode() == KeyEvent.VK_DOWN) {
            snake.snakeBottom();
        }

    }

    @Override
    public void keyTyped(KeyEvent ev) {}
    @Override
    public void keyReleased(KeyEvent ev) {}

}
