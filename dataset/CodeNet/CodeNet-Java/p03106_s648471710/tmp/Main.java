
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//abc120b
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int a =sc.nextInt();
System.out.println("[INST]9;a;sc.nextInt();"+a);
		int b =sc.nextInt();
System.out.println("[INST]10;b;sc.nextInt();"+b);
		int k=sc.nextInt();
System.out.println("[INST]11;k;sc.nextInt();"+k);
		int smaller =Math.min(a, b);
System.out.println("[INST]12;smaller;Math.min(a, b);"+smaller);
		Integer[] divisors =new Integer[smaller+1];
		for (int i=0;i<=smaller;i++) {
			divisors[i] =0;
		}
		for (int i=1;i<=smaller;i++) {
			if (a%i==0&&b%i==0) {
				divisors [i] += i;
			}
		}
		Arrays.sort(divisors, Collections.reverseOrder());
System.out.println("[INST]22;None;Arrays.sort(divisors, Collections.reverseOrder());"+Arrays.sort(divisors, Collections.reverseOrder()));
System.out.println("[INST]22;None;Collections.reverseOrder();"+Collections.reverseOrder());
		System.out.println(divisors[k-1]);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//置き場
	
	//----------------------------------------
}