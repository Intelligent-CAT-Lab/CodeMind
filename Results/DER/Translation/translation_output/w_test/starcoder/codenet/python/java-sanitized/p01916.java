import java.util.*;
public class p01916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'h' || c == 'c' || c == 'p' || c == 'c') ans++;
		}
		System.out.println(ans>>1);
	}
}