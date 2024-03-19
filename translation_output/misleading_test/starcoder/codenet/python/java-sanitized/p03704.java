import java.util.*;
public class p03704 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt();
		int[] dp=new int[21];
		dp[0]=1;
		for(int i=1;i<21;i++){
			int[] dp2=new int[10];
			for(int j=0;j<10;j++){
				for(int k=0;k<10;k++){
					dp2[j]+=dp[i-1]*(10-Math.abs(j-k)-(i<2))*(10-i%2*9);
				}
			}
			dp=dp2;
		}
		System.out.println(dp[D%10]);
	}
}