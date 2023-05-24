import java.util.Scanner;
public class Tax_calculate {
	public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
        
        double in_tax;		//in_tax : 소득세
        
        System.out.print("연간 근로소득을 입력하세요 : ");
        int salary = scan.nextInt();	//salary : 근로소득
        
        if ( salary <= 20000000 ) in_tax = salary * 0.05;
        else if ( salary <= 40000000 ) in_tax = salary * 0.15;
        else if ( salary <= 80000000 ) in_tax = salary * 0.25;
        else in_tax = salary * 0.4;
        
        System.out.println("소득세는 "+(int)in_tax+"원 입니다.");
	}
}