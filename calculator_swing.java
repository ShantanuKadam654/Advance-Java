import java.awt.event.*;
import java.lang.*;
import javax.swing.*;

class cal extends JFrame implements ActionListener
{
			JPanel p;
			JLabel l1;
			JLabel l2;
			JTextField t1;
			JTextField t2;
			JButton b1,b2,bc;

			int a,b,ans=0;

	public cal()
	{
		try
		{
			p=new JPanel();
			l1=new JLabel("Enter First No :");
			t1=new JTextField(30);

			l2=new JLabel("Enter Second No :");
			t2=new JTextField(30);

			b1=new JButton("Addition");
			b2=new JButton("Subtraction");
			bc=new JButton("Clear");

			add(p);
			p.add(l1);
			p.add(t1);

			p.add(l2);
			p.add(t2);

			p.add(b1);
			p.add(b2);
			p.add(bc);

			b1.addActionListener(this);
			b2.addActionListener(this);
			bc.addActionListener(this);

			setSize(400,500);
			setVisible(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();

		if(obj==b1)
		{
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());

			ans=a+b;

			JOptionPane.showMessageDialog(null,"Addition :"+ans);
		}
		else
		{
			if(obj==b2)
			{
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());

				ans=a-b;

				JOptionPane.showMessageDialog(null,"Subtraction :"+ans);
			}
			else
			{
				if(obj==bc)
				{
					t1.setText(" ");
					t2.setText(" ");

					t1.requestFocus();
				}
			}
		}
	}
}

class calculator_swing
{
	public static void main(String args[])
	{
		cal c=new cal();
	}
}