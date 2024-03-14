import java.util.*;
public class p03935 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[] I=new int[n+1];
		I[1]=1;
		for(int i=2;i<=n;i++){
			I[i]=(int)(Math.pow(1000000007,1000000007-i)*I[1000000007%i]%1000000007);
		}
		int r=1,c=1;
		for(int i=2;i<=n;i++){
			r=(r+c*(1000000007-f(2*n-2-2*i)))%1000000007;
			c=(c*(m+i)*I[i+1])%1000000007;
		}
		System.out.println(r);
	}
	public static int f(int n){
		int[] e={1,0,0,1},z={1,1,1,0};
		while(n>0){
			e=new int[]{e,g(e,z)[n%2]};
			z=g(z,z);
			n/=2;
		}
		return e[1];
	}
	public static int[] g(int[] a,int[] b){
		return new int[]{(a[0]*b[0]+a[1]*b[2])%1000000007,(a[0]*b[1]+a[1]*b[3])%1000000007,(a[2]*b[0]+a[3]*b[2])%1000000007,(a[2]*b[1]+a[3]*b[3])%1000000007};
	}
}