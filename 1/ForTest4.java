<<<<<<< HEAD
import java.util.Scanner;

class ForTest4
{
	public static void main(String args[])
	{
		int i, j;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.print("10이하의 정수를 입력하세요 : ");

		if(i<=10){
			for(j = 0; j<i; j++){
				System.out.println("MSG");
			}
		} 
		else{
			System.out.println("해당 범위에 값이 들어있지 않습니다.");
		}
	}
=======
import java.util.Scanner;

class ForTest4
{
	public static void main(String args[])
	{
		int i, j;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.print("10이하의 정수를 입력하세요 : ");

		if(i<=10){
			for(j = 0; j<i; j++){
				System.out.println("MSG");
			}
		} 
		else{
			System.out.println("해당 범위에 값이 들어있지 않습니다.");
		}
	}
>>>>>>> a83b5b8c6957f6f3a78ac53209f45f2c1111dd40
}