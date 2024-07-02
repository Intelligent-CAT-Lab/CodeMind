import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
System.out.println("[INST]7;s;scanner.next();"+s);
		if(s.length()==2) {
System.out.println("[INST]8;None;s.length();"+s.length());
			System.out.println(s);
		}else {
			for(int i=0;i<3;i++) {
				System.out.print(s.charAt(2-i));
			}
			System.out.println();
		}

	}
}
