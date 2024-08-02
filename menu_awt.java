import java.awt.*;
import java.lang.*;

class demo extends Frame
{
	MenuBar mb;
	Menu f,e,s;

	public demo()
	{
		mb=new MenuBar();
		f=new Menu("File");
		e=new Menu("Edit");
		s=new Menu("Search");

		setMenuBar(mb);
		mb.add(f);
		mb.add(e);
		mb.add(s);

		setSize(400,500);
		setVisible(true);
	}
}

class menu_awt
{
	public static void main(String args[])
	{
		demo d=new demo();
	}
}