import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class windowfile extends WindowAdapter{
    public void windowOpened(WindowEvent e){
        System.out.println("Window opened");
    }

    public void windowClosing(WindowEvent e){
        System.out.println("Window closed");
        System.exit(0);
    }


    public static void main(String[] args) {
    }
}
