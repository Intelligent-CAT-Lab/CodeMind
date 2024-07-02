import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]4;s;sc.next();"+s);
		for(int i=s.length()-2; i>=1; i-=2){
System.out.println("[INST]5;None;s.length();"+s.length());
			if(s.substring(0, i/2).equals(s.substring(i/2,i))){
System.out.println("[INST]6;None;s.substring(0, i/2).equals(s.substring(i/2,i));"+s.substring(0, i/2).equals(s.substring(i/2,i)));
System.out.println("[INST]6;None;s.substring(0, i/2);"+s.substring(0, i/2));
System.out.println("[INST]6;None;s.substring(i/2,i);"+s.substring(i/2,i));
				System.out.println(i);
				break;
			}
		}
	}
}