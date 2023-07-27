<<<<<<< HEAD
import java.util.Scanner;

class ForTest6
{
	public static void main (String args[])
	{
		int a, num, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 10개를 입력하세요 : ");
	
		for(a = 0; a < 10; a++){
			num = sc.nextInt();
		if(num % 3 == 0 || num % 5 == 0){
			result = result + 1;
			}	
		}
		System.out.print("3과 5의 배수의 개수 : " + result);	
	}		
}
=======
import java.util.Scanner;

class ForTest6
{
	public static void main (String args[])
	{
		int a, num, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 10개를 입력하세요 : ");
	
		for(a = 0; a < 10; a++){
			num = sc.nextInt();
		if(num % 3 == 0 || num % 5 == 0){
			result = result + 1;
			}	
		}
		System.out.print("3과 5의 배수의 개수 : " + result);	
	}		
}
>>>>>>> a83b5b8c6957f6f3a78ac53209f45f2c1111dd40
