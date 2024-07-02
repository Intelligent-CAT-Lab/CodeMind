import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
		sc.close();
		s += '2';
		int n = s.length(), ans = n - 1;
System.out.println("[INST]9;n;s.length();"+n);
		for(int i = 0; i < n - 1; ++i) {
			if(s.charAt(i) != s.charAt(i + 1)) {
System.out.println("[INST]11;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]11;None;s.charAt(i + 1);"+s.charAt(i + 1));
				int tmp = Math.max(i + 1,  n - i - 2);
System.out.println("[INST]12;tmp;Math.max(i + 1,  n - i - 2);"+tmp);
				ans = Math.min(ans,  tmp);
System.out.println("[INST]13;ans;Math.min(ans,  tmp);"+ans);
			}
		}
		System.out.println(ans);
	}

}
