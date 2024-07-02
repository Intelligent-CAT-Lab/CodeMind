import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
System.out.println("[INST]6;s;scan.next();"+s);
		
		String s1 = "";
		String s2 = "";
		
		String answer ="";
		
		
		
		for(int i = s.length();i>=2;i=i-2){
System.out.println("[INST]15;i;s.length();"+i);
			String S = s.substring(0,i);
System.out.println("[INST]16;S;s.substring(0,i);"+S);
			
			s1 = S.substring(0, S.length()/2);
System.out.println("[INST]18;s1;S.substring(0, S.length()/2);"+s1);
System.out.println("[INST]18;None;S.length();"+S.length());
			s2 = S.substring(S.length()/2, S.length());
System.out.println("[INST]19;s2;S.substring(S.length()/2, S.length());"+s2);
System.out.println("[INST]19;None;S.length();"+S.length());
System.out.println("[INST]19;None;S.length();"+S.length());
			
			
			if(s1.equals(s2)&&S.length()!=s.length()){
System.out.println("[INST]22;None;s1.equals(s2);"+s1.equals(s2));
System.out.println("[INST]22;None;S.length();"+S.length());
System.out.println("[INST]22;None;s.length();"+s.length());
				answer =S;
				break;
			}
			
		}
		
		
		
		System.out.println(answer.length());
		
		
	}

}
