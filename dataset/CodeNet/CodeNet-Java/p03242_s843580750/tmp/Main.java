import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String N = sc.next();
System.out.println("[INST]8;N;sc.next();"+N);

		for (int i = 0; i < 3; i++) {
			if (N.charAt(i) == '1') {
System.out.println("[INST]11;None;N.charAt(i);"+N.charAt(i));
				System.out.print(9);

			} else if (N.charAt(i) == '9') {
System.out.println("[INST]14;None;N.charAt(i);"+N.charAt(i));
				System.out.print(1);
			} else {
				System.out.print(N.charAt(i));
			}
		}

	}

}