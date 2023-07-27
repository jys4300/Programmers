import java.util.Scanner;

class ForTest12
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행을 입력하세요 : ");
		int row = sc.nextInt();
		System.out.print("열을 입력하세요 : ");
		int column = sc.nextInt();

		for(int i=1; i<=row; i++) {
			for (int j=1; j<=column; j++) {
				System.out.print(j*i + "\t");
			}
			System.out.print("\n");
		}
	}
}