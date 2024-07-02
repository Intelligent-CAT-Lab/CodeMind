
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc 	   = new Scanner(System.in);
		String 	string = sc.next();
System.out.println("[INST]7;string;sc.next();"+string);
		int i=0;	boolean isNOTfound=false;
		
		int[]  count = new int[26];
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
						  'o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] chars    = string.toCharArray();
System.out.println("[INST]13;chars;string.toCharArray();"+chars);
		for(i=0;i<chars.length;i++) 
			count[chars[i]-97] ++; 
		for(i=0;i<count.length;i++)
			if(count[i]==0) { isNOTfound = true; break; }
		if(isNOTfound)	System.out.println(alphabet[i]); 
		else 			System.out.println("None");
	}

}
