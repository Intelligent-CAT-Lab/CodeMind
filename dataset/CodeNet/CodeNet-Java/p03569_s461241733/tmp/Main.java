
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		// setOut();
		String str = sc.nextLine();
System.out.println("[INST]21;str;sc.nextLine();"+str);
		System.out.println(help(str));

	}

	private static int help(String str) {
		// TODO Auto-generated method stub
		int s = 0;
		int f = str.length() - 1;
System.out.println("[INST]29;None;str.length();"+str.length());
		int count = 0;
		char[] c = str.toCharArray();
System.out.println("[INST]31;c;str.toCharArray();"+c);
		while (f > s) {
			if (c[f] == c[s]) {
				++s;
				--f;
			} else if (c[f] != 'x' && c[s] != 'x') {
				return -1;
			} else if (c[f] == 'x') {
				++count;
				--f;
			} else if (c[s] == 'x') {
				++count;
				++s;
			}

		}
		return count;
	}

}