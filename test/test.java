
import com.mongodb.internal.connection.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.*;


public class test {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("text frame");
        frame.setLayout(null);
        frame.setBounds(0, 0, 1000, 700);
        JLabel lable=new JLabel("Enter");
        JTextField text=new JTextField();
        JButton button =new JButton("submit");
        lable.setBounds(10, 10, 100, 50);
        text.setBounds(110, 10, 100, 50);
        button.setBounds(60, 100, 100, 50);
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try {
                    Connection con;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    System.out.println("drver ok");
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kanhaiya", "root", "root");
                    System.out.println("connection ok");
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        frame.add(text);
        frame.add(lable);
        frame.add(button);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
