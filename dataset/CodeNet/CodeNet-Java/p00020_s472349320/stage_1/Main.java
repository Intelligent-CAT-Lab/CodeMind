
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
var newVariable_0 = sc.hasNext();			while(newVariable_0) {
				String s = sc.nextLine();
				System.out.println(s.toUpperCase());
			}
		}
	}
}

