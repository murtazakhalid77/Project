package Ui;

import Service.CreateUserService;

import javax.swing.*;
import java.awt.*;

public class SignUpUI {
    public static void main(String[] args) {
        new SignUpUI();
    }
    CreateUserService createUserService =new CreateUserService();
    public SignUpUI() {
        JFrame f= new JFrame("Sign UP PAGE");

        JLabel label1 =new JLabel("Welcome To POS System");
        label1.setBounds(390,100,200,100);

        JLabel label2 =new JLabel("UserName");
        label2.setBounds(380,200,100,80);

        JTextField textField1 =new JTextField("Enter Your UserName");
        textField1.setBounds(460,230,140,20);

        JLabel label3 =new JLabel("Password");
        label3.setBounds(380,250,100,80);

        JTextField password = new JTextField();
        password.setBounds(460,280,140,20);


        JLabel label4 =new JLabel("Confirm ");
        label4.setBounds(400,300,100,80);

        JTextField confirmPassword = new JTextField();
        confirmPassword.setBounds(460,328,140,20);


        JButton SignUp = new JButton("SignUp");
        SignUp.setBackground(new Color(02, 205, 170));
        SignUp.setBounds(500,380,85,20);


        JButton Lgin = new JButton("Login");
        Lgin.setBackground(new Color(02, 205, 170));
        Lgin.setBounds(380,380,85,20);


        f.setBackground(Color.blue);
        JPanel panel=new JPanel();
        panel.setBounds(350,200,255,250);
        panel.setBackground(Color.lightGray);



        SignUp.addActionListener(e->{
            String username=textField1.getText();
            String passwordd=password.getText();
            String confirm=confirmPassword.getText();

            if(passwordd.equalsIgnoreCase(confirm)){

               createUserService.insertUserr(username,passwordd);
                System.out.println("DOne");


            }
            else {
                JOptionPane.showMessageDialog(f,"Passwords are not identical");
            }
        });

        Lgin.addActionListener(e->{

            f.dispose();
            new LoginUi();
            //sent code to save in database after checking both pass fields are same
        });




        f.add(label1);

        f.add(label2);
        f.add(textField1);


        f.add(label3);
        f.add(password);

        f.add(label4);
        f.add(confirmPassword);

        f.add(SignUp);
        f.add(Lgin);

        f.add(panel);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}
