import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fourth {
    public static void main(String[] args) {
        dataentry obj1 = new dataentry();
        suploadfile obj2 = new suploadfile();
        guploadfile obj3 = new guploadfile();
        auploadfile obj4 = new auploadfile();
        viewmarks obj5 = new viewmarks();
        sviewfiles obj6 =new sviewfiles();
        gviewfiles obj7 =new gviewfiles();
        aviewfiles obj8 =new aviewfiles();
        viewcomment obj9 = new viewcomment();
        comment obj10 = new comment();
        gentermarks obj11 = new gentermarks();
        aentermarks obj12 = new aentermarks();
        viewentry obj13 = new viewentry();
        review obj14 = new review();
        adduser obj15 = new adduser();
    }
}

class dataentry extends JFrame {

    JLabel l1 ,l2;
    JTextField t1;
    JButton b,back;

    public dataentry(){

        l1 = new JLabel("Enter Data");
        t1 = new JTextField(20);
        b = new JButton("Submit");
        back = new JButton("Back");
        l2 = new JLabel(" ");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setText("Submitted");

        }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new studentpage();
                dispose();

            }
        });


        add(l1);
        add(t1);
        add(b);
        add(l2);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class suploadfile extends JFrame {

    JLabel l1 ,l2 ;
    JTextField t1;
    JButton b,back;

    public suploadfile(){

        l1 = new JLabel("Choose File To Upload");
        t1 = new JTextField(10);
        b = new JButton("Submit");
        back = new JButton("Back");
        l2 = new JLabel(" ");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setText("Submitted");

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new studentpage();
                dispose();

            }
        });


        add(l1);
        add(t1);
        add(b);
        add(l2);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class guploadfile extends JFrame {

    JLabel l1 ,l2 ;
    JTextField t1;
    JButton b,back;

    public guploadfile(){

        l1 = new JLabel("Choose File To Upload");
        t1 = new JTextField(10);
        b = new JButton("Submit");
        back = new JButton("Back");
        l2 = new JLabel(" ");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setText("Submitted");

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new guidepage();
                dispose();

            }
        });


        add(l1);
        add(t1);
        add(b);
        add(l2);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class auploadfile extends JFrame {

    JLabel l1 ,l2 ;
    JTextField t1;
    JButton b,back;

    public auploadfile(){

        l1 = new JLabel("Choose File To Upload");
        t1 = new JTextField(10);
        b = new JButton("Submit");
        back = new JButton("Back");
        l2 = new JLabel(" ");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setText("Submitted");

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new adminpage();
                dispose();

            }
        });


        add(l1);
        add(t1);
        add(b);
        add(l2);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class viewmarks extends JFrame {

    JLabel l1 ;
    JButton back;

    public viewmarks(){

        l1 = new JLabel("Marks");
        back = new JButton("Back");

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new studentpage();
                dispose();

            }
        });


        add(l1);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class sviewfiles extends JFrame {

    JLabel l1 ;
    JButton back;

    public sviewfiles(){

        l1 = new JLabel("Files");
        back = new JButton("Back");

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new studentpage();
                dispose();

            }
        });

        add(l1);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class gviewfiles extends JFrame {

    JLabel l1 ;
    JButton back;

    public gviewfiles(){

        l1 = new JLabel("Files");
        back = new JButton("Back");

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new guidepage();
                dispose();

            }
        });

        add(l1);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class aviewfiles extends JFrame {

    JLabel l1 ;
    JButton back;

    public aviewfiles(){

        l1 = new JLabel("Files");
        back = new JButton("Back");

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new adminpage();
                dispose();

            }
        });

        add(l1);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class viewcomment extends JFrame {

    JLabel l1 ;
    JButton back;

    public viewcomment(){

        l1 = new JLabel("Comment");
        back = new JButton("Back");

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new studentpage();
                dispose();

            }
        });


        add(l1);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class comment extends JFrame {

    JLabel l1 ,l2;
    JTextField t1;
    JButton b,back;

    public comment(){

        l1 = new JLabel("Comment");
        t1 = new JTextField(20);
        b = new JButton("Submit");
        back = new JButton("Back");
        l2 = new JLabel(" ");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setText("Submitted");

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new guidepage();
                dispose();

            }
        });


        add(l1);
        add(t1);
        add(b);
        add(l2);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class gentermarks extends JFrame {

    JLabel l1 ,l2;
    JTextField t1;
    JButton b,back;

    public gentermarks(){

        l1 = new JLabel("Enter Marks");
        t1 = new JTextField(10);
        b = new JButton("Submit");
        back = new JButton("Back");
        l2 = new JLabel(" ");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setText("Submitted");

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new guidepage();
                dispose();

            }
        });


        add(l1);
        add(t1);
        add(b);
        add(l2);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class aentermarks extends JFrame {

    JLabel l1 ,l2;
    JTextField t1;
    JButton b,back;

    public aentermarks(){

        l1 = new JLabel("Enter Marks");
        t1 = new JTextField(10);
        b = new JButton("Submit");
        back = new JButton("Back");
        l2 = new JLabel(" ");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setText("Submitted");

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new adminpage();
                dispose();

            }
        });


        add(l1);
        add(t1);
        add(b);
        add(l2);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class review extends JFrame {

    JLabel l1 ,l2;
    JTextField t1;
    JButton b,back;

    public review(){

        l1 = new JLabel("Enter review");
        t1 = new JTextField(20);
        b = new JButton("Submit");
        back = new JButton("Back");
        l2 = new JLabel(" ");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setText("Submitted");

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new adminpage();
                dispose();

            }
        });


        add(l1);
        add(t1);
        add(b);
        add(l2);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class viewentry extends JFrame {

    JLabel l1 ;
    JButton back;

    public viewentry(){

        l1 = new JLabel("Entry");
        back = new JButton("Back");

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new guidepage();
                dispose();

            }
        });


        add(l1);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class adduser extends JFrame {

    JLabel l1 ,l2,l3;
    JTextField t1,t2;
    JButton b,back;

    public adduser(){

        l1 = new JLabel("Enter ID");
        t1 = new JTextField(25);
        l3 = new JLabel("Password");
        t2 = new JTextField(25);
        b = new JButton("Add");
        back = new JButton("Back");
        l2 = new JLabel(" ");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setText("Added");

            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new adminpage();
                dispose();

            }
        });


        add(l1);
        add(t1);
        add(l3);
        add(t2);
        add(b);
        add(l2);
        add(back);

        setLayout( new FlowLayout()); /*FlowLayout or GridLayout */
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



