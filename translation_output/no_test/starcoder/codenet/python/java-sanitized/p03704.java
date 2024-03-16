import java.util.*;
public class p03704 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt();
		int[] dp=new int[21];
		dp[0]=1;
		for(int i=1;i<21;i++){
			int[] dp2=new int[21];
			for(int j=0;j<21;j++){
				for(int k=0;k<10;k++){
					int n=9*i+k;
					if(j+k<10)dp2[j+k]+=dp[j]*(10-Math.abs(k)-(j<1));
					if(Math.abs(j+k)<n)dp2[n-Math.abs(j+k)]+=dp[j]*(10-Math.abs(k)-(j<1));
				}
			}
			dp=dp2;
		}
		int sum=0;
		for(int i=0;i<21;i++)sum+=dp[i]*(10-i%2*9);
		System.out.println(sum);
	}
}