package test2;
import java.util.Scanner;
public class t3 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=Sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the numbers: ");
			int values =Sc.nextInt();
			if(values%2==0)
			{
				sum=sum+values;
			}
		}
		System.out.println(sum);
	}
}