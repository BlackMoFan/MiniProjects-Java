import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8668241745854794373L;
	JButton b1;
    About(){
        setBounds(600, 200, 700, 600);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(150, 40, 400, 80);
        add(l1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(50, 180, 70, 70);
        add(l2);

        JLabel l3 = new JLabel("<html>Rod Lester A. Moreno<br>October 21, 2021 3:54 AM<br>© All Rights Reserved<br><br>Making a Notepad Using Java.  Notepad is a native text editor in Windows.</html>");
        l3.setBounds(150, 130, 500, 300);
        l3.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        add(l3);

        b1 = new JButton("OK");
        b1.setBounds(580, 500, 80, 25);
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }

    public static void main(String[] args){
        new About().setVisible(true);
    }
}