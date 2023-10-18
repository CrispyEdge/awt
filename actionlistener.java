import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class actionlistener extends Frame implements ActionListener{
    Label l;
    Button b;

    public actionlistener(){
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(null);

        l = new Label();
        l.setBounds(100, 100, 300, 50);

        b = new Button("Click here");
        b.setBounds(200, 200, 60, 30);

        this.add(l);
        this.add(b);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        l.setText("WELCOME!");
    }
    public static void main(String[] args) {
        new actionlistener();
    }
}
