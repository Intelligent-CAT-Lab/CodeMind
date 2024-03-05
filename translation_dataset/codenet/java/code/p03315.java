import java.util.Scanner;

public class p03315 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
		int num=0;
		for (char c : ary) {
			if(c == '+') num++;
			else num--;
		}
		System.out.println(num);
	}
}

