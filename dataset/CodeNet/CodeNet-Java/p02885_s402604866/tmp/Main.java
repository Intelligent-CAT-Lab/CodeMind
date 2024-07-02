import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

        int yoko = Integer.parseInt(scan.next());
System.out.println("[INST]8;yoko;Integer.parseInt(scan.next());"+yoko);
System.out.println("[INST]8;None;scan.next();"+scan.next());
		int a = Integer.parseInt(scan.next());
System.out.println("[INST]9;a;Integer.parseInt(scan.next());"+a);
System.out.println("[INST]9;None;scan.next();"+scan.next());

		int sum = 0;

		if(yoko - 2*a> 0) {
			sum = yoko - 2*a;
		}

		scan.close();
		System.out.println(sum);

	}

}

