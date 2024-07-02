import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
System.out.println("[INST]6;S;sc.next();"+S);
    boolean anskey = false;
    if (check(S) 
    		&& check(S.substring(0,(S.length()-1)/2)) 
System.out.println("[INST]9;None;S.substring(0,(S.length()-1)/2);"+S.substring(0,(S.length()-1)/2));
System.out.println("[INST]9;None;S.length();"+S.length());
    		&& check(S.substring(((S.length()+3)/2) - 1))) {
System.out.println("[INST]10;None;S.substring(((S.length()+3)/2) - 1);"+S.substring(((S.length()+3)/2) - 1));
System.out.println("[INST]10;None;S.length();"+S.length());
    	anskey = true;
    }
    System.out.println(anskey ? "Yes" : "No");
  }
  
  public static boolean check(String s) {
	  boolean key = true;
	  int N = s.length();
System.out.println("[INST]18;N;s.length();"+N);
	  int L = N - 1;
	  for (int i = 0; i < N/2; i++) {
		  if (s.charAt(i) != s.charAt(L)) {
System.out.println("[INST]21;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]21;None;s.charAt(L);"+s.charAt(L));
			  key = false;
			  break;
		  }
		  L--;
	  }
	  return key;
  }
}
