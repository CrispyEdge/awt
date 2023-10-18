import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

public class button extends Frame{
    public button(){
        this.setVisible(true);
        this.setTitle("GUI");
        this.setSize(500, 500);

        Button b1 = new Button();
        b1.setLabel("Submit");
        b1.setBounds(100, 100, 150, 40);
        
        Button b2 = new Button();
        b2.setLabel("Cancel");
        b2.setBounds(300  , 100, 150, 40);

        this.add(b1);
        this.add(b2);
        this.setLayout(null);
    }
    public static void main(String[] args) {
        button b1 = new button();
    }
}
