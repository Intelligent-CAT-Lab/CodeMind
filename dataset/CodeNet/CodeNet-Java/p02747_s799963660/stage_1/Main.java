import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String N = sc.next();
    	boolean hi = true;
var newVariable_0 = N.length();    	for (int i = 0; i < newVariable_0; i++) {
var newVariable_1 = N.charAt(i);var newVariable_2 = N.charAt(i);    		if ((i%2 == 0 && newVariable_2 != 'h') || (i%2 == 1 && newVariable_2 != 'i')) {
    			hi = false;
    		} 
    	}
    	System.out.println(hi && N.length()%2 ==0 ? "Yes" : "No");
    }
}