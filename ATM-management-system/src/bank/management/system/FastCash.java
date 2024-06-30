package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    
    FastCash(String pin){
        this.pin = pin;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));        
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 960, 1080);
        add(l2);
        
        
        l1 = new JLabel("Select the amount to Withdraw");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(235,400,700,35);
        l2.add(l1);
        
        
        b1 = new JButton("BDT 500");
        b2 = new JButton("BDT 1000");
        b3 = new JButton("BDT 2000");
        b4 = new JButton("BDT 3000");
        b5 = new JButton("BDT 5000");
        b6 = new JButton("BDT 10000");
        b7 = new JButton("Back");
        
        b1.setBounds(170,499,150,35);
        l2.add(b1);
        
        b2.setBounds(390,499,150,35);
        l2.add(b2);
        
        b3.setBounds(170,543,150,35);
        l2.add(b3);
        
        b4.setBounds(390,543,150,35);
        l2.add(b4);
        
        b5.setBounds(170,588,150,35);
        l2.add(b5);
        
        b6.setBounds(390,588,150,35);
        l2.add(b6);
        
        b7.setBounds(390,633,150,35);
        l2.add(b7);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource() == b7){
             setVisible(false);
             new Transactions(pin).setVisible(true);
         }
         else{
         String amount = ((JButton)ae.getSource()).getText().substring(4);
         Conn c = new Conn();
         
         try{
             ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
             int balance =0;
             while(rs.next()){
                 if(rs.getString("type").equals("Deposit")){
                      balance += Integer.parseInt(rs.getString("amount"));
                 }else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
             }if (ae.getSource() != b7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }else{
              Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "BDT. "+amount+" Debited Successfully");
                
                setVisible(false);
                new Transactions(pin).setVisible(true);
              }
         }catch(Exception e){
             System.out.println(e);
         }
       }
    
   }
}
