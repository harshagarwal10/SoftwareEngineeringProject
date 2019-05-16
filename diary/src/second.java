import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class second {
    public static void main(String[] args) {

        student obj1 = new student();
        guide obj2 = new guide();
        admin obj3 = new admin();

    }
}
class student extends JFrame {

    JLabel l1,l2;
    JTextField t1,t2;
    JButton b,back;

    public student(){

        l1 = new JLabel("Student ID");
        l2 = new JLabel("Password");
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        b = new JButton("Submit");
        back = new JButton("Back");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new studentpage();
                dispose();

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new loginpage();
                dispose();

            }
        });


        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class guide extends JFrame {

    JLabel l1,l2;
    JTextField t1,t2;
    JButton b,back;

    public guide(){

        l1 = new JLabel("Guide ID");
        l2 = new JLabel("Password");
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        b = new JButton("Submit");
        back = new JButton("Back");


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new guidepage();
                dispose();

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new loginpage();
                dispose();

            }
        });

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(back);


        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class admin extends JFrame {

    JLabel l1,l2;
    JTextField t1,t2;
    JButton b,back;

    public admin(){

        l1 = new JLabel("Admin Id");
        l2 = new JLabel("Password");
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        b = new JButton("Submit");
        back = new JButton("Back");


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new adminpage();
                dispose();

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new loginpage();
                dispose();

            }
        });

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(back);


        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}