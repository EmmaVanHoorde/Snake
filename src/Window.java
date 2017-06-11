import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame{

    Game componentManager;
    Snake snake;


    static String home = "home";
    static String play = "play";
    static String win = "win";
    static String gameOver = "start over";

    public Window(){

        this.setTitle("Snake");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JButton buttonPlay = new JButton("Jouer");
        JButton buttonLeave = new JButton("Quitter");

        this.setLayout(new FlowLayout());
        this.add(buttonPlay);
        this.add(buttonLeave);
        this.setVisible(true);

        buttonPlay.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                Start start = new Start();
                String stage = start.getStage();
                stage = play;
                start.startGame();
                start.createWindow();
                start.newGame();
            }
        });
        buttonLeave.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

    }

}
