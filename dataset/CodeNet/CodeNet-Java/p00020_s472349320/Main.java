
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				String s = sc.nextLine();
				System.out.println(s.toUpperCase());
			}
		}
	}
}

