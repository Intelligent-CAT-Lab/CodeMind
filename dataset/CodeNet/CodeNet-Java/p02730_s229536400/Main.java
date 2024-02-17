import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean anskey = false;
    if (check(S) 
    		&& check(S.substring(0,(S.length()-1)/2)) 
    		&& check(S.substring(((S.length()+3)/2) - 1))) {
    	anskey = true;
    }
    System.out.println(anskey ? "Yes" : "No");
  }
  
  public static boolean check(String s) {
	  boolean key = true;
	  int N = s.length();
	  int L = N - 1;
	  for (int i = 0; i < N/2; i++) {
		  if (s.charAt(i) != s.charAt(L)) {
			  key = false;
			  break;
		  }
		  L--;
	  }
	  return key;
  }
}
