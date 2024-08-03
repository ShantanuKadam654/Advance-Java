import java.io.*;
import java.lang.*;

class pattern extends Thread
{
	Thread t;
	int no=0;
	int row,col=0;

	public pattern()
	{

		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter Number Of Stars :");
			no=Integer.parseInt(br.readLine());

			System.out.println("");

			start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void run()
	{
		try
		{
			for(row=no;row>=1;row--)
			{
				for(col=row;col>=1;col--)
				{
					System.out.print("*");
				}
				System.out.println("");
				t.sleep(2000);
			}

			for(row=1;row<=no;row++)
			{
				for(col=1;col<=row;col++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}

			System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}
}

class pattern_1_thread
{
	public static void main(String args[])
	{
		pattern n=new pattern();
	}
}