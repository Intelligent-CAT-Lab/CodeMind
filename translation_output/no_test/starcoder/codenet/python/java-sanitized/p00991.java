import java.util.*;
public class p00991 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int h=sc.nextInt();
		int ax=sc.nextInt();
		int ay=sc.nextInt();
		int bx=sc.nextInt();
		int by=sc.nextInt();
		int dx=Math.min(w-Math.abs(ax-bx),Math.abs(ax-bx));
		int dy=Math.min(h-Math.abs(ay-by),Math.abs(ay-by));
		int ans=1;
		if(dx*2==w)ans*=2;
		if(dy*2==h)ans*=2;
		int[][] dp=new int[dx+1][dy+1];
		for(int i=0;i<=dx;i++)dp[i][0]=1;
		for(int i=0;i<=dy;i++)dp[0][i]=1;
		for(int i=1;i<=dx;i++)
			for(int j=1;j<=dy;j++)
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
		ans*=dp[dx][dy];
		System.out.println(ans%100000007);
	}
}