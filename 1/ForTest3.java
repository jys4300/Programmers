class ForTest3
{
	public static void main(String args[]){
		
		int a;

   		System.out.println("홀수:");

			for(a = 1; a<=20; a++){
				if(a % 2 == 1){
				 	System.out.println(a);
				}
			}

		System.out.println(" ");
		System.out.println("짝수:");

			for(a = 1; a<=20; a++){
				if(a % 2 == 0){
					System.out.println(a);
				}
			}
	}
}