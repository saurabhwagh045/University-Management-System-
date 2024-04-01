package university.management.system.saau;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ExamForm extends JFrame implements ActionListener{

    Choice crollno;
    JComboBox cbsemester,cbsubject1,cbsubject2,cbsubject3,cbsubject4,cbsubject5,cbsubject6,cbsubject7,cbsubject8;
    JButton cancel, submit;
    
    ExamForm(){
        
        setSize(500, 800);
        setLocation(300, 150);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
         JLabel heading = new JLabel("Fill Examination Form");
        heading.setBounds(50, 0, 500, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel lblrollnumber = new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50, 70, 150, 20);
        add(lblrollnumber);
        
        crollno = new Choice();
        crollno.setBounds(200, 70, 150, 20);
        add(crollno);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JLabel lblsemester = new JLabel("Select Semester");
        lblsemester.setBounds(50, 110, 150, 20);
        add(lblsemester);
        
        String semester[] = {"1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester" };
        cbsemester = new JComboBox(semester);
        cbsemester.setBounds(200, 110, 150, 20);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);
        
        JLabel lblentersubject = new JLabel("Enter Subject's");
        lblentersubject.setBounds(50, 130, 200, 40);
        lblentersubject.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(lblentersubject);
    
        JLabel lblsub1 = new JLabel("Subject 1:");
        lblsub1.setBounds(150, 160, 150, 20);
        add(lblsub1);
        
        String Subject_1[]={"c Programming ","java Programming"}; 
        cbsubject1 = new JComboBox(Subject_1);
        cbsubject1.setBounds(250, 160,150,20);
        cbsubject1.setBackground(Color.WHITE);
        add(cbsubject1);
        
        JLabel lblsub2= new JLabel("Subject 2:");
        lblsub2.setBounds(150, 200, 150, 20);
        add(lblsub2);
        
        String Subject_2[]={"C++ Programming","Java-II Programming"}; 
        cbsubject2 = new JComboBox(Subject_2);
        cbsubject2.setBounds(250, 200,150,20);
        cbsubject2.setBackground(Color.WHITE);
        add(cbsubject2);
        
        JLabel lblsub3= new JLabel("Subject 3:");
        lblsub3.setBounds(150, 250, 150, 20);
        add(lblsub3);
        
        String Subject_3[]={"Python Programming","Data Structure"}; 
        cbsubject3 = new JComboBox(Subject_2);
        cbsubject3.setBounds(250, 250,150,20);
        cbsubject3.setBackground(Color.WHITE);
        add(cbsubject3);
        
         JLabel lblsub4= new JLabel("Subject 4:");
        lblsub4.setBounds(150, 300, 150, 20);
        add(lblsub4);
        
        String Subject_4[]={"Python Programming","Data Structure"}; 
        cbsubject4 = new JComboBox(Subject_4);
        cbsubject4.setBounds(250, 300,150,20);
        cbsubject4.setBackground(Color.WHITE);
        add(cbsubject4);
        
        JLabel lblsub5= new JLabel("Subject 5:");
        lblsub5.setBounds(150, 350, 150, 20);
        add(lblsub5);
        
        String Subject_5[]={"Python Programming","Data Structure"}; 
        cbsubject5 = new JComboBox(Subject_5);
        cbsubject5.setBounds(250, 350,150,20);
        cbsubject5.setBackground(Color.WHITE);
        add(cbsubject5);
       
        JLabel lblsub6= new JLabel("Subject 6:");
        lblsub6.setBounds(150, 400, 150, 20);
        add(lblsub6);
        
        String Subject_6[]={"Python Programming","Data Structure"}; 
        cbsubject6 = new JComboBox(Subject_6);
        cbsubject6.setBounds(250, 400,150,20);
        cbsubject6.setBackground(Color.WHITE);
        add(cbsubject6);
        
        JLabel lblsub7= new JLabel("Subject 7:");
        lblsub7.setBounds(150, 450, 150, 20);
        add(lblsub7);
        
        String Subject_7[]={"Python Programming","Data Structure"}; 
        cbsubject7 = new JComboBox(Subject_7);
        cbsubject7.setBounds(250, 450,150,20);
        cbsubject7.setBackground(Color.WHITE);
        add(cbsubject7);
        
        JLabel lblsub8= new JLabel("Subject 8:");
        lblsub8.setBounds(150, 500, 150, 20);
        add(lblsub8);
        
        String Subject_8[]={"Python Programming","Data Structure"}; 
        cbsubject8 = new JComboBox(Subject_8);
        cbsubject8.setBounds(250, 500,150,20);
        cbsubject8.setBackground(Color.WHITE);
        add(cbsubject8);
        
        
        submit = new JButton("Submit");
        submit.setBounds(70, 600, 150, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Back");
        cancel.setBounds(280, 600, 150, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
  public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
                String rollno =(String)crollno.getSelectedItem();
                String semester = (String)cbsemester.getSelectedItem();
                String Subject1 = (String)cbsubject1.getSelectedItem();
                String Subject2 = (String)cbsubject2.getSelectedItem();
                String Subject3 = (String)cbsubject3.getSelectedItem();
                String Subject4 = (String)cbsubject4.getSelectedItem();
                String Subject5 = (String)cbsubject5.getSelectedItem();
                String Subject6 = (String)cbsubject6.getSelectedItem();
                String Subject7 = (String)cbsubject7.getSelectedItem();
                String Subject8 = (String)cbsubject8.getSelectedItem();
            
            try {
              
                
                String query = "insert into examForm values('"+rollno+"','"+semester+"','"+Subject1+"','"+Subject2+"','"+Subject3+"','"+Subject4+"','"+Subject5+"','"+Subject6+"','"+Subject7+"','"+Subject8+"')";

               Conn con = new Conn();
               con.s.executeUpdate(query);
                
                
                JOptionPane.showMessageDialog(null, "Exam Form Submitted Sucessfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
public static void main(String args[]){
    new ExamForm();
}
}