import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]4;s;sc.next();"+s);
		String t = "";
		for(int i=0; i<s.length(); i++){
System.out.println("[INST]6;None;s.length();"+s.length());
			if(s.charAt(i)=='B'){
System.out.println("[INST]7;None;s.charAt(i);"+s.charAt(i));
				if(t.length()!=0) t = t.substring(0, t.length()-1);
System.out.println("[INST]8;None;t.length();"+t.length());
System.out.println("[INST]8;t;t.substring(0, t.length()-1);"+t);
System.out.println("[INST]8;None;t.length();"+t.length());
			}
			else t += s.charAt(i);
System.out.println("[INST]10;t;s.charAt(i);"+t);
		}
		System.out.println(t);
	}
}