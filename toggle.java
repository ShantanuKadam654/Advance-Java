import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class toggle extends Applet implements Runnable,ActionListener
{
	Thread t;
	String str1,str2;
	Button b1,b2;

	public toggle()
	{
		super();

		try
		{
			t=new Thread(this);

			b1=new Button("OK");
			b2=new Button("CANCLE");

			add(b1);
			add(b2);

			setSize(1000,1000);
			setVisible(true);

			b1.addActionListener(this);
			b2.addActionListener(this);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		Object obj=ae.getSource();

		if(obj==b1)
		{
			t.start();
		}
		else
		{
			t.stop();
		}
	}

	public void run()
	{
		try
		{
			while(true)
			{
				str1=b1.getLabel();
				str2=b2.getLabel();

				b1.setLabel(str2);
				b2.setLabel(str1);

				t.sleep(300);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}