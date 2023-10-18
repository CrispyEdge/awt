import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class textfield extends Frame{
    public textfield(){
        this.setVisible(true);
        this.setSize(500, 500);

        Label l = new Label("Username: ");
        TextField t = new TextField();

        l.setBounds(50, 100, 100, 50);
        t.setBounds(150, 100, 200, 40);

        this.add(l);
        this.add(t);
        this.setLayout(null);


    }
    public static void main(String[] args) {
        textfield obj = new textfield();
    }
}
