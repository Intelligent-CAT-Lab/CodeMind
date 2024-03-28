class main:
    import java.util.Scanner;
    
    public class p02771 {
    
    	public static void main(String[] args) {
    
    		Scanner scan = new Scanner(System.in);
    		int A = scan.nextInt();
    		int B = scan.nextInt();
    		int C = scan.nextInt();
    
    		if((A == B and B == C) or (A!=B and A!=C and B!=C) ) {
    			System.out.println("No");
    		}else {
    			System.out.println("Yes");
    		}
    	}
    
    }