import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]5;n;sc.nextInt();"+n);
		int k = sc.nextInt();
System.out.println("[INST]6;k;sc.nextInt();"+k);
		
		if(k == 1){
			ans = 0;
		}else{
			ans = n - k;
		}
		
		System.out.println(ans);
	}
}
