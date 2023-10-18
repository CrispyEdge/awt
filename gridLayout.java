import java.awt.*;

public class gridLayout extends Frame{
    public gridLayout(){
        this.setVisible(true);
        this.setSize(500, 500);

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");

        this.add(b1); this.add(b2); this.add(b3);
        this.add(b4); this.add(b5); this.add(b6);

        this.setLayout(new GridLayout());
        
    }
    public static void main(String[] args) {
        gridLayout obj = new gridLayout(); 
    }
}
