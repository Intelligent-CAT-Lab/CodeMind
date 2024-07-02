import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]6;n;sc.nextInt();"+n);

		long sunukeNum = 1;

		for(int i=0;i<n;i++){
			
			String sunukeString = "" + sunukeNum;
			double min = Double.MAX_VALUE;
			long sunukecand = 0;

			for(int j=0;j<sunukeString.length() + 1;j++){
System.out.println("[INST]16;None;sunukeString.length();"+sunukeString.length());
				String nine = "";
				for(int k=0;k<j;k++){
					nine += "9";
				}

				String compose = sunukeString.substring(0,sunukeString.length() - j) + nine;
System.out.println("[INST]22;None;sunukeString.substring(0,sunukeString.length() - j);"+sunukeString.substring(0,sunukeString.length() - j));
System.out.println("[INST]22;None;sunukeString.length();"+sunukeString.length());
				double sunukecandidate = Long.parseLong(compose)*calc(Long.parseLong(compose));
System.out.println("[INST]23;None;Long.parseLong(compose);"+Long.parseLong(compose));
System.out.println("[INST]23;None;Long.parseLong(compose);"+Long.parseLong(compose));

				if(min > sunukecandidate){
					min = sunukecandidate;
					sunukecand = Long.parseLong(compose);
System.out.println("[INST]27;sunukecand;Long.parseLong(compose);"+sunukecand);
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