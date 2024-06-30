package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;



public class Deposit extends JFrame implements ActionListener{
    JTextField amount;
    JButton deposit, back;
    //JLabel l1,l2,l3;
    String pin;
    
    
    Deposit(String pin){
        this.pin = pin;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));        
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 960, 1080);
        add(image);
        
        
        JLabel text = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(200,400,700,35);
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(355, 485, 150, 30);
        image.add(deposit);
        deposit.addActionListener(this);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        image.add(back);
        back.addActionListener(this);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD,22));
        amount.setBounds(200,350,320,25);
        image.add(amount);
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==deposit){
           String number = amount.getText();
           Date date = new Date();
           if(number.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter the amount");
           }else{
               try{
                   Conn co = new Conn();
                   String q = "insert into bank values('"+pin+"', '"+date+"', 'Deposit','"+number+"')";
                   co.s.executeUpdate(q);
                   JOptionPane.showMessageDialog(null, "BDT. "+number+" Deposited Successfully");
                   setVisible(false);
                   new Transactions(pin).setVisible(true);
               }catch(Exception e){
                   System.out.println(e);
               }
               
           }
       }else if(ae.getSource()==back){
           setVisible(false);
           new Transactions(pin).setVisible(true);
       }
    }
    
}
