import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String N = sc.next();
System.out.println("[INST]6;N;sc.next();"+N);
    	boolean hi = true;
    	for (int i = 0; i < N.length(); i++) {
System.out.println("[INST]8;None;N.length();"+N.length());
    		if ((i%2 == 0 && N.charAt(i) != 'h') || (i%2 == 1 && N.charAt(i) != 'i')) {
System.out.println("[INST]9;None;N.charAt(i);"+N.charAt(i));
System.out.println("[INST]9;None;N.charAt(i);"+N.charAt(i));
    			hi = false;
    		} 
    	}
    	System.out.println(hi && N.length()%2 ==0 ? "Yes" : "No");
    }
}