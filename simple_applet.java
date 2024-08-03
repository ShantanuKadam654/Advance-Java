import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class simple_applet extends Applet implements ActionListener
{
	Button b1;

	public void init()
	{
		b1=new Button("CLICK");
	}

	public void start()
	{
		add(b1);

		setSize(500,500);
		setVisible(true);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object ob=e.getSource();

		if(ob==b1)
		{
			System.out.println("Indira College");
		}
	}
}