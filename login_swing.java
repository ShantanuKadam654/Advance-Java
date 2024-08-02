import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class error extends Exception
{

}

class demo extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	String str1,str2;
	static int cnt=0;

	public demo()
	{
		p=new JPanel();
		l1=new JLabel("Enter Username :");
		l2=new JLabel("Enter Passward :");

		t1=new JTextField(30);
		t2=new JTextField(30);
		//t2.setEchoChar(" * ");

		b1=new JButton("LOGIN");
		b2=new JButton("RESET");

		add(p);

		p.add(l1);
		p.add(t1);

		p.add(l2);
		p.add(t2);

		p.add(b1);
		p.add(b2);

		setSize(400,400);
		setVisible(true);

		b1.addActionListener(this);
		b2.addActionListener(this);


	}

	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();

		if(ob==b1)
		{
			try
			{
				str1=t1.getText();
				str2=t2.getText();

				if(str1.equals(str2))
				{
					System.out.println("Login Successfull..");
				}
				else
				{
					throw new error();
				}
			}
			catch(error er)
			{
				cnt++;

				JOptionPane.showMessageDialog(null,"LOGIN FAIL:\nPlease enter valid name and passward \n Attemps("+cnt+"/3)");

				t1.setText("");
				t2.setText("");

				t1.requestFocus();

				if(cnt>2)
				{
					JOptionPane.showMessageDialog(null,"Attemps Over..");
					System.exit(0);
				}
			}
		}
		else
		{
			if(ob==b2)
			{
				t1.setText("");
				t2.setText("");

				t1.requestFocus();
			}
		}
	}
}

class login_swing
{
	public static void main(String args[])
	{
		demo d=new demo();
	}
}