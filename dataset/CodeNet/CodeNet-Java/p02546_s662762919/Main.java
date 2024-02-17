import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String t = scanner.next();
		
		scanner.close();
		
		if (t.endsWith("s")) {
			System.out.println(t.concat("es"));
		} else {
			System.out.println(t.concat("s"));
		}
	}

}
