import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long S = sc.nextLong();
		long c = sc.nextLong();
		long ans = 0;
		if( S>=c/2 ){
			ans = c/2;
		}else{
			ans = S + (c/2-S)/2;
		}
		System.out.println(ans);
	}
}
