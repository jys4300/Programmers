import java.util.Scanner;

class ForAvgRank
{
	public static void main(String args[])
	{
		int ClassCount, StudentCount;
		Scanner sc = new Scanner(System.in);

		System.out.println("******************************");
		System.out.println("*           반 평균          *");
		System.out.println("******************************");
		System.out.println();	
		System.out.print("입력받을 반의 개수 (2~4) ==> ");
		
		ClassCount = sc.nextInt();

		if ( ClassCount<2 || ClassCount>4 ) {
			do {
				System.out.println("[ 입력 가능한 반은 2~4반입니다. 다시 입력해주세요. ]");
				System.out.print("입력받을 반의 개수 (2~4) ==> ");
				ClassCount = sc.nextInt();
			}
			while ( ClassCount<2 || ClassCount<4 );
		}
		
		System.out.print("입력받을 학생 수 (2~4) ==> ");
		StudentCount = sc.nextInt();

		if ( StudentCount<2 || StudentCount>4 ) {
			do {
				System.out.println("[ 입력 가능한 학생수는 2~4명입니다. 다시 입력해주세요. ]");
				System.out.print("입력받을 학생 수 (2~4) ==> ");	
				StudentCount = sc.nextInt();  			
			}
			while ( StudentCount<2 || StudentCount>4 );
		}	

		System.out.println("[ 총 " + ClassCount + "개의 반이 존재합니다. ]");
		System.out.println("[ 각 학급별 학생 수는 " + StudentCount + "명 입니다. ]");	


		int[] point = new int[ClassCount*StudentCount];

		for (int i=0; i<point.length; i++) {
			System.out.print("[" + (i+1) + "] " + (i%ClassCount+1) + "반 학생 점수 입력 (0~100) ==> ");
			point[i] = sc.nextInt();
			
			if ( point[i]<0 || point[i]>100 ) {
				do {
					System.out.println("[ 잘못된 범위의 점수가 입력되었습니다. 다시 입력해주세요. ]");
				  	System.out.print("[" + (i+1) + "] " + (i%ClassCount+1) + "반 학생 점수 입력 (0~100) ==> ");
				  	point[i] = sc.nextInt();
				}
				while ( point[i]<0 || point[i]>100 );
			}
		}

		System.out.println();

		int[] sum = new int[ClassCount];

		for (int i=0; i<point.length; i++)
			sum[i%ClassCount] += point[i];
			
		
		double[] avg = new double[ClassCount];

		for (int i=0; i<ClassCount; i++)
			avg[i] = (double)sum[i]/StudentCount;
			
		
		int[] rank = new int[ClassCount];	
			
		for (int i=0; i<ClassCount; i++)
		{	
			int Rank = 1;
			for (int j=0; j<ClassCount; j++)
			{
				if (avg[i] < avg[j])
					Rank++;
			}
			rank[i] = Rank;
		}
		
		for (int i=0; i<ClassCount; i++) {
			System.out.printf("[%d반] 점수 : %.2f - [%d등]", i+1, avg[i], rank[i]);
			System.out.println();
		} 

		int Max=0, Min=0;
		double max, min, gap;
		max = avg[0];  
		min = avg[0];

		for (int i=1; i<ClassCount; i++) {
			if (max < avg[i]) {
				max = avg[i];
				Max = i;
			}
			if (min > avg[i]) {
				min = avg[i];
				Min = i;
			}
		}
		
		gap = max - min;
		System.out.print("\n");
		System.out.printf("[ 제일 잘한 반은 %d반이며, %d반의 평균 점수는 %.2f점으로, 제일 점수가 낮은 %d반의 평균인 %.2f점보다 %.2f점 높습니다. ]", Max+1, Max+1, max, Min+1, min, gap);
	}
}