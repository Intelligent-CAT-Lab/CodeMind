import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long S = sc.nextLong();
System.out.println("[INST]5;S;sc.nextLong();"+S);
		long c = sc.nextLong();
System.out.println("[INST]6;c;sc.nextLong();"+c);
		long ans = 0;
		if( S>=c/2 ){
			ans = c/2;
		}else{
			ans = S + (c/2-S)/2;
		}
		System.out.println(ans);
	}
}
