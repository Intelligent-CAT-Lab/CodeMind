
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0, p = 0;
		String s;
		char s1[], tmp;
		boolean e = true;
		
		s = sc.nextLine();
System.out.println("[INST]13;s;sc.nextLine();"+s);
		sc.close();
		tmp = s.charAt(0);
System.out.println("[INST]15;tmp;s.charAt(0);"+tmp);
		s1 = new char[s.length()];
System.out.println("[INST]16;None;s.length();"+s.length());
		
		for(int i = 0; i < s.length(); ++i) {
System.out.println("[INST]18;None;s.length();"+s.length());
			s1[i] = s.charAt(i);
System.out.println("[INST]19;None;s.charAt(i);"+s.charAt(i));
			if(tmp != s1[i])e = false;
		}
		
		if(e)System.out.println(count);
		else {
			while(!e) {
				e = true;
				if(tmp == 'W')tmp = 'B';
				else tmp = 'W';
				
				for(int i = p; i < s.length(); ++i) {
System.out.println("[INST]30;None;s.length();"+s.length());
					if(s1[i]!= tmp)s1[i] = tmp;
					else { 
						p = i;
						break;
					}
				}
				for(int i = p; i < s.length(); ++i) {
System.out.println("[INST]37;None;s.length();"+s.length());
					if(s1[i] != tmp) {
						e = false;
						break;
					}
				}
				++count;
			}
			System.out.println(count);
		}
	}
}
