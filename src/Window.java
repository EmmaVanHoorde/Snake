import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame{

    static String home = "home";
    static String play = "play";
    static String win = "win";
    static String gameOver = "start over";

    public Window(){
        Start start = new Start();
        //Level speed = new Level();

        this.setTitle("Snake");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JButton buttonPlay = new JButton("niveau 1");
        JButton buttonPlay2 = new JButton("niveau 2");
        JButton buttonLeave = new JButton("Quitter");

        this.setLayout(new FlowLayout());
        this.add(buttonPlay);
        this.add(buttonPlay2);
        this.add(buttonLeave);
        this.setVisible(true);

        buttonPlay.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {

                start.setLevel(false);

                start.startGame();
                start.createWindow();
                start.newGame();
            }
        });
        buttonPlay2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {

                start.setLevel(true);

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
