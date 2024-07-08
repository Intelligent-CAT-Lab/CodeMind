
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0, p = 0;
		String s;
		char s1[], tmp;
		boolean e = true;
		
		s = sc.nextLine();
		sc.close();
		tmp = s.charAt(0);
var newVariable_0 = s.length();		s1 = new char[newVariable_0];
		
var newVariable_1 = s.length();		for(int i = 0; i < newVariable_1; ++i) {
var newVariable_2 = s.charAt(i);			s1[i] = newVariable_2;
			if(tmp != s1[i])e = false;
		}
		
		if(e)System.out.println(count);
		else {
			while(!e) {
				e = true;
				if(tmp == 'W')tmp = 'B';
				else tmp = 'W';
				
var newVariable_3 = s.length();				for(int i = p; i < newVariable_3; ++i) {
					if(s1[i]!= tmp)s1[i] = tmp;
					else { 
						p = i;
						break;
					}
				}
var newVariable_4 = s.length();				for(int i = p; i < newVariable_4; ++i) {
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
