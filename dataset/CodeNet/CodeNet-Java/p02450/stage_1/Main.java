import java.util.Scanner;

public class Main { 
	static Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) { 
    	
    	int n = scan.nextInt();
		String str = "";

    	for(int i=1; i<=n; i++) {
    		String str2 = String.valueOf(i);
    		str += str2;
    	}
    	
    	permutation(str, "");
    }
    		
    public static void permutation(String q, String ans){
    	// Base Case
var newVariable_0 = q.length();    	if(newVariable_0 <= 1) {
var newVariable_1 = ans.length();  		    if(newVariable_1 != 0) ans += " ";
    		System.out.println(ans + q);
    	}
    	// General Case
    	else {
var newVariable_2 = q.length();    		for (int i = 0; i < newVariable_2; i++) {
var newVariable_3 = ans.length();var newVariable_4 = q.substring(0, i);var newVariable_5 = q.substring(i + 1);var newVariable_6 = q.charAt(i);    			if(ans.length() == 0) permutation(q.substring(0, i) + q.substring(i + 1), ans + newVariable_6);
var newVariable_7 = q.substring(0, i);var newVariable_8 = q.substring(i + 1);var newVariable_9 = q.charAt(i);    			else permutation(q.substring(0, i) + q.substring(i + 1),ans + " " + newVariable_9);
    		}
    	}
    }    	
} 
