import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class thread_applet extends Applet implements ActionListener,Runnable
{
	Thread t;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	int i=0;
	int str,end;

	public void init()
	{
		t=new Thread(this);

		l1=new Label("Enter Start No");
		l2=new Label("Enter End No:");
		l3=new Label("Result:");

		t1=new TextField(30);
		t2=new TextField(30);
		t3=new TextField(30);

		b1=new Button("Start");
		b2=new Button("Stop");
	}

	public void start()
	{
		add(l1);
		add(t1);

		add(l2);
		add(t2);

		add(l3);
		add(t3);

		add(b1);
		add(b2);

		setSize(700,700);
		setVisible(true);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();

		if(obj==b1)
		{
			t.start();
		}
		else
		{
			if(obj==b2)
			{
				t.stop();
			}
		}
	}

	public void run()
	{
		try
		{
			str=Integer.parseInt(t1.getText());
			end=Integer.parseInt(t2.getText());

			for(i=str;i<=end;i++)
			{
				t3.setText(""+i);
				System.out.println("\t"+i);
				t.sleep(70);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}