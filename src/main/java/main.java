import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {
    public static void main(String[] args) {
        Keeper keeper= new Keeper("Geoff",4392, 80);
        Lion lion=new Lion("Simba",7, 30);
        Frame frame = new Frame();
        Map drawing = new Map();
        frame.add(drawing);
        //Drawing settings
        drawing.setSize(600, 600);
        drawing.setBackground(Color.WHITE);
        //Frame settings
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }

}
