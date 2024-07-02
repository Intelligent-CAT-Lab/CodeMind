import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
System.out.println("[INST]4;s;sc.next();"+s);
		char c=s.charAt(0);
System.out.println("[INST]5;c;s.charAt(0);"+c);
		int sum=0;
		for(int i=0;i<s.length();i++){
System.out.println("[INST]7;None;s.length();"+s.length());
			if(c!=s.charAt(i)){
System.out.println("[INST]8;None;s.charAt(i);"+s.charAt(i));
				sum++;
				c=s.charAt(i);
System.out.println("[INST]10;c;s.charAt(i);"+c);
			}
		}
		System.out.print(sum);
	}
}
