    import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String string = sc.nextLine();
    		boolean b = string.contains("a") && string.contains("b") && string.contains("c");
    		System.out.println(b ? "Yes" : "No");
    	}
     
    }