package fee_report;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class AccountantSection extends JFrame implements ActionListener
{
	JLabel l1,i1;
	JButton bt1,bt2,bt3,bt4,bt5,bt6;
	JPanel p1,p2,p3;
	Font f,f1;
	
	AccountantSection()
	{
		super("Accountant Section Page");
		setLocation(100,100);
		setSize(400,300);
		
		l1=new JLabel("Accountant Section");
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setForeground(Color.BLUE);
		
		bt1=new JButton("Add Student");
		bt2=new JButton("View Student");
		bt3=new JButton("Edit Student");
		bt4=new JButton("Due Fees");
		bt5=new JButton("Logout");
		bt6=new JButton("Back");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		
		f=new Font("Ariel",Font.BOLD,20);
		f1=new Font("Ariel",Font.BOLD,15);
		
		l1.setFont(f);
		bt1.setFont(f1);
		bt2.setFont(f1);
		bt3.setFont(f1);
		bt4.setFont(f1);
		bt5.setFont(f1);
		bt6.setFont(f1);
		
		ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("fee_report/icons/Student.png"));
		Image img2=img.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT); 
		ImageIcon img3=new ImageIcon(img2);
		i1=new JLabel(img3);
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(1,1,10,10));
		p1.add(l1);
		
		p2=new JPanel();
		p2.setLayout(new GridLayout(6,1,10,10));
		p2.add(bt1);
		p2.add(bt2);
		p2.add(bt3);
		p2.add(bt4);
		p2.add(bt5);
		p2.add(bt6);
		
		p3=new JPanel();
		p3.setLayout(new GridLayout(1,1,10,10));
		p3.add(i1);
		
		setLayout(new BorderLayout(0,0));
		
		add(p1,"North");
		add(p2,"East");
		add(p3,"Center");
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bt1)
		{
			new AddStudent().setVisible(true);
		}
		if(e.getSource()==bt2)
		{
			new ViewStudent().setVisible(true);
		}
		if(e.getSource()==bt3)
		{
			new EditStudent().setVisible(true);
		}
		if(e.getSource()==bt4)
		{
			new DueFees().setVisible(true);
		}
		if(e.getSource()==bt5)
		{
			this.setVisible(false);
			new Index().setVisible(true);
		}
		if(e.getSource()==bt6)
		{
			this.setVisible(false);
			new Accountant().setVisible(true);
		}
	}
	public static void main(String[] args)
	{
		new AccountantSection().setVisible(true);
	}
}
