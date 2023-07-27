class ForTest9
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++) {
			for (int a=1; a<=10; a++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

//print();은 출력을 하는 output이기 때문에 9번라인에 print를 쓰면 오류가 발생한다.