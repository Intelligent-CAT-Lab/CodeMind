class main:
    import java.util.Scanner;
    
    public class p03281 {
    
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
    		int ans = 0;
    		for(int i = 1; i <= n; i++) {
    			if(i % 2 == 1) {
    				int divcount = 0;
    				for(int k = 1; k <= n; k++) {
    					if(i % k == 0) divcount++;
    				}
    				if(divcount == 8) {
    					ans++;
    					//System.out.println(i);//è©²å½å¤ç¢ºèªç¨
    				}
    			}
    		}
    		System.out.println(ans);
    		sc.close();
    	}
    
    }