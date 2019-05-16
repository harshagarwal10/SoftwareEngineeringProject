import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first {
    public static void main(String[] args) {

        loginpage obj = new loginpage();
    }
}

class loginpage extends JFrame {

    //JLabel l1,l2,l3;
    JLabel l4;
    JButton b1,b2,b3;

    public loginpage(){

        //l1 = new JLabel("Student");
        //l2 = new JLabel("Guide");
        //l3 = new JLabel("Admin");
        l4 = new JLabel("                  Diary Management System                  ");
        b1 = new JButton("Student");
        b2 = new JButton("Guide");
        b3 = new JButton("Admin");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new student();
                dispose();

            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new guide();
                dispose();

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new admin();
                dispose();

            }
        });

        add(l4);

        //add(l1);
        add(b1);

        //add(l2);
        add(b2);

        //add(l3);
        add(b3);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
