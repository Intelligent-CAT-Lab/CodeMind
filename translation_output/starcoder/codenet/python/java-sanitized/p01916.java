import java.util.*;
import java.io.*;

public class p01916 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'O' || s.charAt(i) == 'J' || s.charAt(i) == 'S' || s.charAt(i) == 'B' || s.charAt(i) == 'T' || s.charAt(i) == 'L' || s.charAt(i) == 'C' || s.charAt(i) == 'D' || s.charAt(i) == 'M') {
				ans++;
			}
		}
		System.out.println(ans>>1);
	}
}