import java.awt.*;
import java.awt.event.*;;

public class borderLayout extends Frame{
    public borderLayout(){
        this.setVisible(true);
        
        this.setSize(500, 500);
        
        Button b1 = new Button("EAST");
        Button b2 = new Button("WEST");
        Button b3 = new Button("NORTH");
        Button b4 = new Button("SOUTH");
        Button b5 = new Button("CENTER");


        this.add(b1, BorderLayout.EAST);
        this.add(b2, BorderLayout.WEST);
        this.add(b3, BorderLayout.NORTH);
        this.add(b4, BorderLayout.SOUTH);
        this.add(b5, BorderLayout.CENTER);
        
    }
    public static void main(String[] args) {
        borderLayout obj = new borderLayout();
    }
}
