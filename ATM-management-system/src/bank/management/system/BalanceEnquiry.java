
package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    JLabel l1, l2, l3;
    JButton b1, b2, b3;
    String pin;
    
    BalanceEnquiry(String pin){
        this.pin = pin;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));        
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);
        
        l1 = new JLabel();
        l1.setForeground(Color.white);
        l1.setFont(new Font("System", Font.BOLD, 16));

        b1 = new JButton("BACK");
        
        l1.setBounds(190, 350, 400, 35);
        l3.add(l1);

        b1.setBounds(390, 633, 150, 35);
        l3.add(b1);
        int balance = 0;
        Conn c = new Conn();
         try{
             ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
             while(rs.next()){
                 if(rs.getString("type").equals("Deposit")){
                      balance += Integer.parseInt(rs.getString("amount"));
                 }else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){}
        
        l1.setText("Your Current Account Balance is BDT "+balance);

        b1.addActionListener(this);

        
        setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transactions(pin).setVisible(true);
    }
    
}
