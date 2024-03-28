import java.util.*;
public class p03704 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int D=sc.nextInt();
		int[] dp=new int[21];
		dp[0]=1;
		for(int i=1;i<21;i++){
			int[] dp2=new int[100];
			for(int j=0;j<100;j++){
				for(int k=0;k<10;k++){
					int n=9*i+k;
					if(j+n<100)dp2[j+n]+=dp[i]*(10-Math.abs(k)-(i<1));
				}
			}
			dp=dp2;
		}
		int sum=0;
		for(int i=0;i<100;i++){
			if(i%2==0)sum+=dp[i]*(10-i/2);
			else sum+=dp[i]*(10-i/2-1);
		}
		System.out.println(sum);
	}
}