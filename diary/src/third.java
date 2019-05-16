import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class third {
    public static void main(String[] args) {
        studentpage obj1 = new studentpage();
        guidepage obj2 = new guidepage();
        adminpage obj3 = new adminpage();
    }
}

class studentpage extends JFrame {

    JButton b1,b2,b3,b4,b5,back;

    public studentpage(){

        b1 = new JButton("Data Entry");
        b2 = new JButton("Upload File");
        b3 = new JButton("View Marks");
        b4 = new JButton("View Files");
        b5 = new JButton("View Comment");
        back = new JButton("Back");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new dataentry();
                dispose();

            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new suploadfile();
                dispose();

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new viewmarks();
                dispose();

            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new sviewfiles();
                dispose();

            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new viewcomment();
                dispose();

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new loginpage();
                dispose();

            }
        });


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(back);


        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class guidepage extends JFrame {

    JButton b1,b2,b3,b4,b5,back;

    public guidepage(){

        b1 = new JButton("Comment");
        b2 = new JButton("Upload File");
        b3 = new JButton("Enter Marks");
        b4 = new JButton("View Files");
        b5 = new JButton("View Entry");
        back = new JButton("Back");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new comment();
                dispose();

            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new guploadfile();
                dispose();

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new gentermarks();
                dispose();

            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new gviewfiles();
                dispose();

            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new viewentry();
                dispose();

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new loginpage();
                dispose();

            }
        });


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(back);


        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class adminpage extends JFrame {

    JButton b1,b2,b3,b4,b5,back;

    public adminpage(){

        b1 = new JButton("Review");
        b2 = new JButton("Upload File");
        b3 = new JButton("Enter Marks");
        b4 = new JButton("View Files");
        b5 = new JButton("Add User");
        back = new JButton("Back");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new review();
                dispose();

            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new auploadfile();
                dispose();

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new aentermarks();
                dispose();

            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new aviewfiles();
                dispose();

            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new adduser();
                dispose();

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new loginpage();
                dispose();

            }
        });


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}