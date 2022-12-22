package Ui;

import org.example.Main;

import javax.swing.*;
import java.awt.*;

public class LoginUi {
    public static void main(String[] args) {
        new LoginUi();
    }
    public LoginUi() {
        JFrame f= new JFrame("lOGIN PAGE");

        JLabel label1 =new JLabel("Welcome To POS System");
        label1.setBounds(390,100,200,100);

        JLabel label2 =new JLabel("UserName");
        label2.setBounds(380,200,100,80);

        JTextField textField1 =new JTextField("Enter Your UserName");
        textField1.setBounds(455,230,140,20);

        JLabel label3 =new JLabel("Password");
        label3.setBounds(380,250,100,80);

        JPasswordField password = new JPasswordField();
        password.setBounds(455,280,140,20);

        JButton lgin = new JButton("LogIn");
        lgin.setBackground(new Color(02, 205, 170));
        lgin.setBounds(400,310,85,20);

        JButton SignUp = new JButton("SignUp");
        SignUp.setBackground(new Color(02, 205, 170));
        SignUp.setBounds(500,310,85,20);


        f.setBackground(Color.blue);
        JPanel panel=new JPanel();
        panel.setBounds(350,200,255,250);
        panel.setBackground(Color.lightGray);

        lgin.addActionListener(e->{

            //START AFTER LOGIN CODE HERE
        });

        SignUp.addActionListener(e->{

            //START AFTER SignUp CODE HERE
            f.dispose();
            new SignUpUI();
        });




        f.add(label1);
        f.add(textField1);
        f.add(label2);
        f.add(password);
        f.add(lgin);
        f.add(SignUp);
        f.add(label3);
        f.add(panel);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }

}


