    import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String string = sc.nextLine();
var newVariable_0 = string.contains("a");var newVariable_1 = string.contains("b");var newVariable_2 = string.contains("c");    		boolean b = string.contains("a") && string.contains("b") && newVariable_2;
    		System.out.println(b ? "Yes" : "No");
    	}
     
    }