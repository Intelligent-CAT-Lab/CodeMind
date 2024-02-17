import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long h=sc.nextLong();
		long ans=0;
		long t=1;
		while(h>=t){
			ans+=t;
			t*=2;
		}
		System.out.println(ans);
	}
}