import java.util.Scanner;

public class Main { 
	static Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) { 
    	
    	int n = scan.nextInt();
System.out.println("[INST]7;n;scan.nextInt();"+n);
		String str = "";

    	for(int i=1; i<=n; i++) {
    		String str2 = String.valueOf(i);
System.out.println("[INST]11;str2;String.valueOf(i);"+str2);
    		str += str2;
    	}
    	
    	permutation(str, "");
    }
    		
    public static void permutation(String q, String ans){
    	// Base Case
    	if(q.length() <= 1) {
System.out.println("[INST]20;None;q.length();"+q.length());
  		    if(ans.length() != 0) ans += " ";
System.out.println("[INST]21;None;ans.length();"+ans.length());
    		System.out.println(ans + q);
    	}
    	// General Case
    	else {
    		for (int i = 0; i < q.length(); i++) {
System.out.println("[INST]26;None;q.length();"+q.length());
    			if(ans.length() == 0) permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
System.out.println("[INST]27;None;ans.length();"+ans.length());
System.out.println("[INST]27;None;q.substring(0, i);"+q.substring(0, i));
System.out.println("[INST]27;None;q.substring(i + 1);"+q.substring(i + 1));
System.out.println("[INST]27;None;q.charAt(i);"+q.charAt(i));
    			else permutation(q.substring(0, i) + q.substring(i + 1),ans + " " + q.charAt(i));
System.out.println("[INST]28;None;q.substring(0, i);"+q.substring(0, i));
System.out.println("[INST]28;None;q.substring(i + 1);"+q.substring(i + 1));
System.out.println("[INST]28;None;q.charAt(i);"+q.charAt(i));
    		}
    	}
    }    	
} 
