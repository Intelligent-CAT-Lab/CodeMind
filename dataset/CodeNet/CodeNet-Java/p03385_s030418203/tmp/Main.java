    import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String string = sc.nextLine();
System.out.println("[INST]6;string;sc.nextLine();"+string);
    		boolean b = string.contains("a") && string.contains("b") && string.contains("c");
System.out.println("[INST]7;None;string.contains('a');"+string.contains("a"));
System.out.println("[INST]7;None;string.contains('b');"+string.contains("b"));
System.out.println("[INST]7;None;string.contains('c');"+string.contains("c"));
    		System.out.println(b ? "Yes" : "No");
    	}
     
    }