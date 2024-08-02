import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class mouse_event_applet extends Applet implements MouseListener,MouseMotionListener
{
	int x,y;
	TextField t1;

	public void init()
	{
		t1=new TextField(30);

		add(t1);
	}

	public void start()
	{
		setSize(400,400);
		setVisible(true);

		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseEntered(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();

		t1.setText("x="+x+"y"+y);
	}
	public void mouseExited(MouseEvent e)
	{
			x=e.getX();
			y=e.getY();

		t1.setText("x="+x+"y"+y);
	}

	public void mousePressed(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();

		t1.setText("x="+x+"y"+y);
	}

	public void mouseReleased(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();

		t1.setText("x="+x+"y"+y);
	}

	public void mouseClicked(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();

		t1.setText("x="+x+"y"+y);
	}

	public void mouseMoved(MouseEvent e)
	{
			x=e.getX();
			y=e.getY();

			t1.setText("x="+x+"y"+y);
	}

	public void mouseDragged(MouseEvent e)
	{
			x=e.getX();
			y=e.getY();

			t1.setText("x="+x+"y"+y);
	}
}