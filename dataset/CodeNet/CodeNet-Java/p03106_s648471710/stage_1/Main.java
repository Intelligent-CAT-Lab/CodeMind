
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//abc120b
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int a =sc.nextInt();
		int b =sc.nextInt();
		int k=sc.nextInt();
		int smaller =Math.min(a, b);
		Integer[] divisors =new Integer[smaller+1];
		for (int i=0;i<=smaller;i++) {
			divisors[i] =0;
		}
		for (int i=1;i<=smaller;i++) {
			if (a%i==0&&b%i==0) {
				divisors [i] += i;
			}
		}
var newVariable_0 = Collections.reverseOrder();		Arrays.sort(divisors, newVariable_0);
		System.out.println(divisors[k-1]);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//置き場
	
	//----------------------------------------
}