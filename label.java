import java.awt.Label;
import java.awt.Frame;

public class label extends Frame{
    public label(){
        this.setVisible(true);
        this.setSize(500, 500);

        Label l1 = new Label("Username");
        Label l2 = new Label("Password");
        l1.setBounds(50, 100 , 100, 30);
        l2.setBounds(50, 150 , 100, 30);

        this.add(l1);
        this.add(l2);
        this.setLayout(null);
    }
    public static void main(String[] args) {
        label obj = new label();
    }
}
