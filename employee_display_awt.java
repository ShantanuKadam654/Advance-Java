import java.awt.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

class employee extends Frame
{
	JPanel p;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	int id,sal;
	String name;

	public void accept()
	{
		p=new JPanel();
		t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(30);

		l1=new JLabel("Employee ID :");
		l2=new JLabel("Employee Name :");
		l3=new JLabel("Employee Salary");

		add(p);
		p.add(l1);
		p.add(t1);

		p.add(l2);
		p.add(t2);

		p.add(l3);
		p.add(t3);

		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter ID :");
			id=Integer.parseInt(br.readLine());
			t1.setText(""+id);

			System.out.println("Enter Name :");
			name=br.readLine();
			t2.setText(""+name);

			System.out.println("Enter Salary :");
			sal=Integer.parseInt(br.readLine());
			t3.setText(""+sal);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		setSize(400,400);
		setVisible(true);
	}
}

class employee_display_awt
{
	public static void main(String args[])
	{
		employee d=new employee();
		d.accept();
	}
}