import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class p04030 {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		String s = sc.next();
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!= 'B') {
				t += s.substring(i, i + 1);
			} else if (t.equals("")) {
				continue;
			} else {
				t = t.substring(0, t.length() - 1);
			}
		}
		System.out.println(t);

	}

	//ä»¥ä¸ãèªä½ã©ã¤ãã©ãª

	//éä¹
	public static int fact(int n