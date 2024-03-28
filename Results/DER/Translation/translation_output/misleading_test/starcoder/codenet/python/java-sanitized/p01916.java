import java.util.*;
import java.io.*;

public class p01916 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'c' || s.charAt(i) == 'h' || s.charAt(i) == 'p') {
				ans++;
			}
		}
		System.out.println(ans>>1);
	}
}