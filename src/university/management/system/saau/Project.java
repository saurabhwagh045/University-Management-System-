package university.management.system.saau;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Saurabh$aau
 */
public  class Project extends JFrame implements ActionListener {
    
    Project(){
        setSize(1448,735);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/viewGreen.jpg"));
        Image i2=i1.getImage().getScaledInstance(1400,720,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo= new JMenuItem("New Faculty Information");
        facultyInfo.setForeground(Color.darkGray);
        facultyInfo.addActionListener(this );
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setForeground(Color.darkGray);
        studentInfo.addActionListener(this );
        newInformation.add(studentInfo);
        
        JMenu details = new JMenu("View The Iformation");
        details.setForeground(Color.ORANGE);
        mb.add(details);
        
        JMenuItem facultydetails= new JMenuItem("View Faculty Information");
        facultydetails.setForeground(Color.green);
        facultydetails.addActionListener(this );
        details.add(facultydetails);
        
        JMenuItem studentdetails= new JMenuItem("View Student Information");
        studentdetails.setForeground(Color.green);
        studentdetails.addActionListener(this );
        details.add(studentdetails);
        
        JMenu leave = new JMenu("Apply for Leave");
        leave.setForeground(Color.RED);
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setForeground(Color.BLACK);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave= new JMenuItem("Student Leave");
        studentleave.setForeground(Color.BLACK);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        
         JMenu leaveDetails = new JMenu("View Leave Information");
         leaveDetails.setForeground(Color.RED);
        mb.add(leaveDetails);
        
        JMenuItem facultyLeavedetails= new JMenuItem("View Faculty Leave Details");
        facultyLeavedetails.setForeground(Color.BLACK);
        facultyLeavedetails.addActionListener(this);
        leaveDetails.add(facultyLeavedetails);
        
        JMenuItem studentLeavedetails= new JMenuItem("View Student Leave Details");
        studentLeavedetails.setForeground(Color.BLACK);
        studentLeavedetails.addActionListener(this);
        leaveDetails.add(studentLeavedetails);
        
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.GRAY);
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Result");
        examinationdetails.setForeground(Color.darkGray);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setForeground(Color.darkGray);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        JMenu upDateInfo = new JMenu("Update Details");
        upDateInfo.setForeground(Color.BLUE);
        upDateInfo.addActionListener(this);
        mb.add(upDateInfo);
        
        JMenuItem updateFacultyInfo = new JMenuItem("Update Faculty Information");
        updateFacultyInfo.setForeground(Color.darkGray);
        updateFacultyInfo.addActionListener(this);
        upDateInfo.add(updateFacultyInfo);
        
        JMenuItem updateStudentInfo = new JMenuItem("Upadate Student Information");
        updateStudentInfo.setForeground(Color.darkGray);
        updateStudentInfo.addActionListener(this);
        upDateInfo.add(updateStudentInfo);
        
                
        JMenu fees = new JMenu("Fees Details");
        fees.setForeground(Color.BLUE);
        mb.add(fees);
        
        JMenuItem feestructure = new JMenuItem("Fees Structure");
        feestructure.setForeground(Color.darkGray);
        feestructure.addActionListener(this);
        fees.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Students Fees Form");
        feeform.setForeground(Color.darkGray);
        feeform.addActionListener(this);
        fees.add(feeform);
        
        
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setForeground(Color.CYAN);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setForeground(Color.red);
        calculator.addActionListener(this);
        utility.add(calculator);
        
        JMenu about= new JMenu("About");
        about.setForeground(Color.RED);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About Us >>");
        ab.setForeground(Color.ORANGE);
        ab.addActionListener(this);
        about.add(ab);
        
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("See You");
        ex.setForeground(Color.ORANGE);
        ex.addActionListener(this);
        exit.add(ex);
        
         setJMenuBar(mb);
         
         
        setVisible(true);
        
    }
    
   /* public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        
        
        if(msg.equals("Exit")) {
            setVisible(false);
           }else if(msg.equals("Calculator"))
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                
            }else if(msg.equals("Notepad"))
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                 }else if(msg.equals("new Faculty Informaiton"));
            new AddTeacher();
}else if(msg.equals("New Student Information"));
new AddStudent();
}
}
*/
 public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("See You")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                
            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                
            }
        } else if (msg.equals("New Faculty Information")) {
           new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        }else if (msg.equals("View Student Information")){
            new StudentDetails();
        }else if (msg.equals("View Faculty Information")){
            new TeacherDetails();
        }else if (msg.equals("Faculty Leave")){
             new TeacherLeave();
        }else if (msg.equals("Student Leave")){
             new StudentLeave();
        }else if (msg.equals("Upadate Student Information")){
              new UpdateStudent();
        }else if (msg.equals("Update Faculty Information")){
              new UpdateTeacher();
        }else if (msg.equals("View Student Leave Details")){
             new StudentLeaveDetails();
        }else if (msg.equals("View Faculty Leave Details")){
             new TeacherLeaveDetails();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Examination Result")) {
            new ExaminationDetails();
        } else if (msg.equals("Fees Structure")) {
            new FeeStructure();
        }  else if (msg.equals("Students Fees Form")) {
            new StudentFeeForm();
        }else if (msg.equals("About Us >>")) {
            new About();
        }
 }
 
    public static void main(String[] args){
       new Project();
        
    }
}