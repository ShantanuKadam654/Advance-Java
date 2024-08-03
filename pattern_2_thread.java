import java.io.*;
import java.lang.*;

class pattern2 extends Thread
{
	Thread t;
	int no,row,col;

	public pattern2()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter Number of Lines:");
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
			for(row=1;row<=no;row++)
			{
				for(col=1;col<=row;col++)
				{
					if(row%2==0)
					{
						System.out.print("#");
					}
					else
					{
						System.out.print("*");
					}
				}
				System.out.println("");
				t.sleep(2000);
			}

			System.out.println("");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class pattern_2_thread
{
	public static void main(String args[])
	{
		pattern2 n1=new pattern2();
	}
}