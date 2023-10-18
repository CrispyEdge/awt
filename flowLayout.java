import java.awt.*;

public class flowLayout extends Frame{

    public flowLayout(){
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("GUI");

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");

        this.add(b1); this.add(b2); this.add(b3);
        this.add(b4); this.add(b5);

        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
    }
    public static void main(String[] args) {
        flowLayout obj = new flowLayout();
    }
}
