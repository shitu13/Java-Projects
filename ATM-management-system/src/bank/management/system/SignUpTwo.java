package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class SignUpTwo extends JFrame implements ActionListener{
    

    
    JTextField pan, aadhar;
    JRadioButton syes, sno, eyes, eno;
    JButton next;
    JComboBox religion, category, occupation, education, income;
    String formno;
    
    
    
    Random random = new Random();
    long first4 = (random.nextLong() % 9000L) + 1000L;
    String first = ""+ Math.abs(first4);
    
    
    SignUpTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - Page 2");
        

        JLabel additionalDetails = new JLabel("Additional Details: Page 2");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Muslim", "Hindu", "Christian","Buddhist","Others","Keep it Private"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setFont(new Font("Arial", Font.BOLD, 14));
        add(religion);
        
        JLabel fname = new JLabel("Category: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);


        String valCategory[] = {"General", "Savings", "Current"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setFont(new Font("Arial", Font.BOLD, 14));
        add(category);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomeCategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setFont(new Font("Arial", Font.BOLD, 14));
        add(income);
        

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        JLabel email = new JLabel("Qualification: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        String educationValues[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setFont(new Font("Arial", Font.BOLD, 14));
        add(education);

        JLabel marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String occupationValues[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setFont(new Font("Arial", Font.BOLD, 14));
        add(occupation);
     
        JLabel address = new JLabel("PAN Number: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        pan = new JTextField(15);
        pan.setBounds(300,440,400,30);
        pan.setFont(new Font("Arial", Font.BOLD, 14));
        add(pan);

        JLabel city = new JLabel("Adhar Number: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        aadhar = new JTextField(15);
        aadhar.setBounds(300,490,400,30);
        aadhar.setFont(new Font("Arial", Font.BOLD, 14));
        add(aadhar);

        JLabel state = new JLabel("Senior Citizen: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 120, 30);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setBounds(450, 540, 120, 30);
        add(sno);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(syes);
        gendergroup.add(sno);

        JLabel pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 120, 30);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setBounds(450, 590, 120, 30);
        add(eno);
        
        ButtonGroup gendergroup1 = new ButtonGroup();
        gendergroup1.add(eyes);
        gendergroup1.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(500, 120);
        setVisible(true);
     }
    
    public void actionPerformed(ActionEvent ae){
        String formno = ""+random;
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }else{
            seniorcitizen = "NO";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        }else if(eno.isSelected()){
            existingaccount = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
            Conn c1 = new Conn();
                
            String q = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"', '"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"', '"+seniorcitizen+"','"+existingaccount+"')";
            c1.s.executeUpdate(q);
            
            //SignUP3 Obj
            setVisible(false);
            new SignUpThree(formno).setVisible(true);
       
        }catch(Exception e){
            System.out.println(e);
        }
            
    }
    
}
