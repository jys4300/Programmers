import java.util.Scanner;
public class Tax_calculate {
	public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
        
        double in_tax;		//in_tax : �ҵ漼
        
        System.out.print("���� �ٷμҵ��� �Է��ϼ��� : ");
        int salary = scan.nextInt();	//salary : �ٷμҵ�
        
        if ( salary <= 20000000 ) in_tax = salary * 0.05;
        else if ( salary <= 40000000 ) in_tax = salary * 0.15;
        else if ( salary <= 80000000 ) in_tax = salary * 0.25;
        else in_tax = salary * 0.4;
        
        System.out.println("�ҵ漼�� "+(int)in_tax+"�� �Դϴ�.");
	}
}