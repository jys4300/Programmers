<<<<<<< HEAD
import java.util.Scanner;

class Dollar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int won;
		double dollar;

		System.out.print("원화를 입력하세요(단위:원) : ");
		won = sc.nextInt(); 
		dollar = (double) won / 1260;
		System.out.printf(won + "원은 $%.2f입니다.", dollar);
	}	
=======
import java.util.Scanner;

class Dollar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int won;
		double dollar;

		System.out.print("원화를 입력하세요(단위:원) : ");
		won = sc.nextInt(); 
		dollar = (double) won / 1260;
		System.out.printf(won + "원은 $%.2f입니다.", dollar);
	}	
>>>>>>> a83b5b8c6957f6f3a78ac53209f45f2c1111dd40
}