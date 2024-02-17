import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long sunukeNum = 1;

		for(int i=0;i<n;i++){
			
			String sunukeString = "" + sunukeNum;
			double min = Double.MAX_VALUE;
			long sunukecand = 0;

			for(int j=0;j<sunukeString.length() + 1;j++){
				String nine = "";
				for(int k=0;k<j;k++){
					nine += "9";
				}

				String compose = sunukeString.substring(0,sunukeString.length() - j) + nine;
				double sunukecandidate = Long.parseLong(compose)*calc(Long.parseLong(compose));

				if(min > sunukecandidate){
					min = sunukecandidate;
					sunukecand = Long.parseLong(compose);
				}

			}

			System.out.println(sunukecand);
			sunukeNum = sunukecand + 1;

		}
	}
	public static double calc(long num){
		int gradesum = 0;
		while(num >= 1){
			gradesum += num%10;
			num = num/10;
		}
		return (double)1/gradesum;
	}
 
}