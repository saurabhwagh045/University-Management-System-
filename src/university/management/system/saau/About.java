package university.management.system.saau;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Saurabh
 */

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Saaau.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 225, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 225);
        add(image);
        
        JLabel heading = new JLabel("<html><h1>University<br/>Management System</h1></html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Saurabh Ramesh Wagh");
        name.setBounds(70, 220, 600, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
        JLabel rollno = new JLabel("Roll number: 222111210233 ");
        rollno.setBounds(70, 280, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: waghsaurabh045@gmail.com");
        contact.setBounds(70, 340, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}

