import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
System.out.println("[INST]5;ary;sc.next().toCharArray();"+ary);
System.out.println("[INST]5;None;sc.next();"+sc.next());
		int num=0;
		for (char c : ary) {
			if(c == '+') num++;
			else num--;
		}
		System.out.println(num);
	}
}

