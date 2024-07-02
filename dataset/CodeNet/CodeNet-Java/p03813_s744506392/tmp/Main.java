import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
System.out.println("[INST]6;x;sc.nextInt();"+x);
		if(x<1200) {
			System.out.println("ABC");
		}else {
			System.out.println("ARC");
		}
	}
}
