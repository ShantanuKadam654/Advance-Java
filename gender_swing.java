import java.awt.*;
import java.lang.*;

class qq extends Frame
{
	Panel p;
	Label lb;
	TextField txt1;

	Label gender;
	CheckboxGroup cg;
	Checkbox c1;
	Checkbox c2;

	public qq()
	{
		p=new Panel();
		lb=new Label("Enter Name :");
		txt1=new TextField();

		gender=new Label("Select Gender :");
		cg=new CheckboxGroup();
		c1=new Checkbox("Male",cg,true);
		c2=new Checkbox("Female",cg,false);

		add(p);
		p.add(lb);
		p.add(txt1);

		p.add(gender);
		p.add(c1);
		p.add(c2);

		setSize(400,400);
		setVisible(true);
	}
}

class gender_swing
{
	public static void main(String args[])
	{
		qq q=new qq();
	}
}