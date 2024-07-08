import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean anskey = false;
    if (check(S) 
var newVariable_0 = S.substring(0,(S.length()-1)/2);var newVariable_1 = S.length();    		&& check(S.substring(0,(newVariable_1-1)/2)) 
var newVariable_2 = S.substring(((S.length()+3)/2) - 1);var newVariable_3 = S.length();    		&& check(S.substring(((newVariable_3+3)/2) - 1))) {
    	anskey = true;
    }
    System.out.println(anskey ? "Yes" : "No");
  }
  
  public static boolean check(String s) {
	  boolean key = true;
	  int N = s.length();
	  int L = N - 1;
	  for (int i = 0; i < N/2; i++) {
var newVariable_4 = s.charAt(i);var newVariable_5 = s.charAt(L);		  if (s.charAt(i) != newVariable_5) {
			  key = false;
			  break;
		  }
		  L--;
	  }
	  return key;
  }
}
