import java.util.Scanner;

class SwitchOp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String op;
		int num1, num2;
		System.out.print("수식 입력(수와 연산자 사이는 공백을 둘 것) : ");
		
		op = sc.next();
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		switch(op){
			case "+":
				System.out.println(num1+ " + " +num2+ " = " +(num1+num2));
				break;

			case "-":
				System.out.println(num1+ " - " +num2+ " = " +(num1-num2));
				break;

			case "*":
				System.out.println(num1+ " * " +num2+ " = " +(num1*num2));
				break;

			case "/":
				System.out.println(num1+ " / " +num2+ " = " +(num1/num2));
				break;

			default:
				System.out.println("사칙 연산자가 아닙니다.");
		}
	}
}