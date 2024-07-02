import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
System.out.println("[INST]6;str;sc.nextLine();"+str);
		
		sc.close();
		
		int size = str.length();
System.out.println("[INST]10;size;str.length();"+size);
		
		for(int i = 1 ; i < size ; i++){
			if(str.charAt(i) == str.charAt(i-1)){
System.out.println("[INST]13;None;str.charAt(i);"+str.charAt(i));
System.out.println("[INST]13;None;str.charAt(i-1);"+str.charAt(i-1));
				System.out.println(i + " " + (i+1));
				System.exit(0);
System.out.println("[INST]15;None;System.exit(0);"+System.exit(0));
			}
		}
		
		for(int i = 2 ; i < size ; i++){
			if(str.charAt(i) == str.charAt(i-2)){
System.out.println("[INST]20;None;str.charAt(i);"+str.charAt(i));
System.out.println("[INST]20;None;str.charAt(i-2);"+str.charAt(i-2));
				System.out.println((i-1) + " " + (i+1));
				System.exit(0);
System.out.println("[INST]22;None;System.exit(0);"+System.exit(0));
			}
		}
		
		System.out.println(-1 + " " + -1);
	}
}
