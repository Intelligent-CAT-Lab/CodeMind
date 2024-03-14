import java.util.*;
public class p03896 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n-2/n;i++){
			System.out.println(-(n<3)or" "+".join(Integer.toString((i-~(j^(n%2<(j+2<n>i*2))))%n+1)for j in range(n-1)));
		}
	}
}