import java.util.Scanner;

class Fact_method
{
	public static void main(String args[])
	{
		int a = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("n을 입력하세요 : ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			a = a * i;
		}
		System.out.println(n + "! = " + a);
	}
}