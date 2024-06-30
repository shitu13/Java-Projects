package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class Login extends JFrame implements ActionListener{
    JLabel l1, l2, l3;
    JTextField tf1;
    JPasswordField pf;
    JButton clear, signin, signup;

    Login(){
        setTitle("AUTOMATIC TELLER MACHINE");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);

        label.setBounds(70,10,100, 100);
        add(label);

        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200,40,450,40);
        add(l1);

        l2 = new JLabel("Card No: ");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(125, 150, 375, 30);
        add(l2);

        tf1 = new JTextField(15);
        tf1.setBounds(300,150,230,30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);

        l3 = new JLabel("PIN: ");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setBounds(125, 220, 375, 30);
        add(l3);

        pf = new JPasswordField(15);
        pf.setFont(new Font("Arial", Font.BOLD, 14));
        pf.setBounds(300,220,230,30);
        add(pf);

        signin = new JButton("SIGN IN");
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        
        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        
        signup = new JButton("SIGN UP");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);

        setLayout(null);

        signin.setFont(new Font("Arial", Font.BOLD, 14));
        signin.setBounds(300,300,100,30);
        add(signin);
        
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBounds(430,300,100,30);
        
        add(clear);
        
        signup.setFont(new Font("Arial", Font.BOLD, 14));
        signup.setBounds(300,350,230,30);
        add(signup);

        clear.addActionListener(this);
        signup.addActionListener(this);
        signin.addActionListener(this);
        

        setSize(800, 450);
        setVisible(true);
    }

   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            tf1.setText("");
            pf.setText("");
           
        }else if(ae.getSource() == signin){
            Conn co = new Conn();
            String cardno= tf1.getText();
            String pinno = pf.getText();
            
            String q = "select * from login where cardnumber = '"+cardno+"' and pin = '"+pinno+"'";
            
            try{
                ResultSet rs = co.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinno).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }catch(Exception e){
                System.out.println(e);
            }

        }else if(ae.getSource() == signup){
            setVisible(false);
            new SignUpOne().setVisible(true);

        }
    }
    
    public static void main(String[] args) throws Exception {
        new Login().setVisible(true);
        
        //new SignUpTwo("");
        //new SignUpThree("");
        //new Transactions("");
        
        //new Deposit("");
        //new FastCash("");
        //new PinChange("");
       
    }
}
