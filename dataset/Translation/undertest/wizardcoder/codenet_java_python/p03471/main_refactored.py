class main:
    import java.util.Scanner;
    
    public class p03471 {
    
    	public static void main(String[] args) {
    		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
    		Scanner sc = new Scanner(System.in);
    
    		int X = sc.nextInt();
    		int Y = sc.nextInt();
    
    		int sum=0;
    		boolean judge=false;
    		int a=0;
    		int b=0;
    		int c=0;
    
    		for (int i=0; i<X+1; i++) {
    			for (int k=0; k<X-i+1; k++) {
    				sum = 10000*i + 5000*k + 1000*(X-i-k);
    				if (sum==Y) {
    					judge = true;
    					a=i;
    					b=k;
    					c=X-i-k;
    					break;
    				}
    			}
    		}
    		if (judge) {
    			System.out.print(a);
    			System.out.print(" ");
    			System.out.print(b);
    			System.out.print(" ");
    			System.out.print(c);
    
    		} else {
    			System.out.println("-1 -1 -1");
    		}
    
    	}
    
    }