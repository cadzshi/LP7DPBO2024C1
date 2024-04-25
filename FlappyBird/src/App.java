import javax.swing.*;

public class App {
    public static void main(String[] args){
        //  buat sebuah frame
        JFrame frame = new JFrame("Flappy Bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360, 480);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        //  buat objek JPanel
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
