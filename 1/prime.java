import java.util.Scanner;
class prime
{
	public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.print("숫자를 입력해주세요 : ");
	   
	   int a = scn.nextInt();
	   System.out.println("입력된 수는: "+a);
       
	   int i = a-1;
	   int j = 2;
	   
	   while(j <= i){
			if(a%j == 0) {
				System.out.println(a + "는 소수가 아닙니다.");
				System.exit(0);
             }
            else {
                j = j+1;
            }          
        } 
        System.out.println(a + "는 소수입니다.");
		}
}