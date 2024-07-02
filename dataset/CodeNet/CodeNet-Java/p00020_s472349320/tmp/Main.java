
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
System.out.println("[INST]6;None;sc.hasNext();"+sc.hasNext());
				String s = sc.nextLine();
System.out.println("[INST]7;s;sc.nextLine();"+s);
				System.out.println(s.toUpperCase());
			}
		}
	}
}

