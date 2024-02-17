import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
		if(s.length()==2) {
			System.out.println(s);
		}else {
			for(int i=0;i<3;i++) {
				System.out.print(s.charAt(2-i));
			}
			System.out.println();
		}

	}
}
