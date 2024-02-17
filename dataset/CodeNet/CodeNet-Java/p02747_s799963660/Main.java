import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String N = sc.next();
    	boolean hi = true;
    	for (int i = 0; i < N.length(); i++) {
    		if ((i%2 == 0 && N.charAt(i) != 'h') || (i%2 == 1 && N.charAt(i) != 'i')) {
    			hi = false;
    		} 
    	}
    	System.out.println(hi && N.length()%2 ==0 ? "Yes" : "No");
    }
}