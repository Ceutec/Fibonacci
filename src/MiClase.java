import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MiClase
{
	static int fibonacci(int num)
	{
		if(num==0)
		{
			return 0;
		}
		
		if(num==1)
		{
			return 1;
		}
		
		return fibonacci(num-1)+fibonacci(num-2);
	}
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(fibonacci(i));
		}
		       
	}
}
