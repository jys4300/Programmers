class ForTest16
{
	public static void main(String[] args) 
	{	
		//줄의 개수
		for (int i=1; i<=5; i++) {
			//공백 출력 , j가 5일때 j가 i보다 크거나 같을때까지 5부터1까지 감소하며 실행
			for (int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			//별을 출력 , j가 1일때 j가 i보다 작거나 같을때까지 증가하며 실행
			for (int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}