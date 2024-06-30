
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignUpThree extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    
    SignUpThree(String formno){
        
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        
        
        l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100,140, 200, 30);
        add(type);
        
        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.white);
        r1.setBounds(100, 180, 200, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.white);
        r2.setBounds(350, 180, 200, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.white);
        r3.setBounds(100, 220, 200, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.white);
        r4.setBounds(350, 220, 200, 20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100,300, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-1254");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330,300, 300, 30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 digit card number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100,330, 300, 15);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100,370, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330,370, 200, 30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 digit pin number");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100,400, 300, 15);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100,450, 200, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5 = new JCheckBox("Checkbook");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-statements");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100,680,600,20);
        add(c7);
     
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b1.setBounds(250,720,100,30);
        add(b1);
        
        b2.setBounds(420,720,100,30);
        add(b2);
    
        
        setSize(850,850);
        setLocation(500,120);
        setVisible(true);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
//     public static void main(String[] args){
//        //new Login().setVisible(true);
//        //new SignUpTwo("");
//        new SignUpThree();
//       
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String atype = null;
        
        if(r1.isSelected()){ 
            atype = "Saving Account";
        }
        else if(r2.isSelected()){ 
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            atype = "Current Account";
        }else if(r4.isSelected()){ 
            atype = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            if(ae.getSource()==b1){
            if(atype.equals("")){
                JOptionPane.showMessageDialog(null, "Fill in all the fields.");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";  
                String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                
                JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
                
                new Deposit(pin).setVisible(true);
                setVisible(false);
            }
            
            }else if(ae.getSource()==b2){
                System.exit(0);
                }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
    
  
