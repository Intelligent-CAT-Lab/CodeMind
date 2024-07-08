import java.util.Scanner;
	public class Main
		{ public static void main(String[] args)
			{   
			    Scanner scanner = new Scanner(System.in);
			    int X = scanner.nextInt();
			    int A = scanner.nextInt();
			    int B = scanner.nextInt();
			    
			    if (B <= A) {
			    	System.out.println("delicious");
			    } else if ((B-A) <= X) {
			    	System.out.println("safe");
			    } else {
			    	System.out.println("dangerous");
			    }
		}
		}