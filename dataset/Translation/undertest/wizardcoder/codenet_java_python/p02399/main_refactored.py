class main:
    import java.util.Scanner;
    
    public class p02399 {
    
    	public static void main(String[] args) {
    		
    		Scanner sc = new Scanner(System.in);
    		
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		
    		sc.close();
    		
    		int d = a/b;
    		int r = a%b;
    		String f = String.format("%.5f",