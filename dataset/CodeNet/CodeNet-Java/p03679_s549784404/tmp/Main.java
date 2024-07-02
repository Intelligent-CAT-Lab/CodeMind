import java.util.Scanner;
	public class Main
		{ public static void main(String[] args)
			{   
			    Scanner scanner = new Scanner(System.in);
			    int X = scanner.nextInt();
System.out.println("[INST]5;X;scanner.nextInt();"+X);
			    int A = scanner.nextInt();
System.out.println("[INST]6;A;scanner.nextInt();"+A);
			    int B = scanner.nextInt();
System.out.println("[INST]7;B;scanner.nextInt();"+B);
			    
			    if (B <= A) {
			    	System.out.println("delicious");
			    } else if ((B-A) <= X) {
			    	System.out.println("safe");
			    } else {
			    	System.out.println("dangerous");
			    }
		}
		}