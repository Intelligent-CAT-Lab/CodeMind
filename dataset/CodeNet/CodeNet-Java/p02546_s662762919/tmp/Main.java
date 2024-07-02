import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String t = scanner.next();
System.out.println("[INST]8;t;scanner.next();"+t);
		
		scanner.close();
		
		if (t.endsWith("s")) {
System.out.println("[INST]12;None;t.endsWith('s');"+t.endsWith("s"));
			System.out.println(t.concat("es"));
		} else {
			System.out.println(t.concat("s"));
		}
	}

}
