
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
		s1 = new char[s.length()];
		
		for(int i = 0; i < s.length(); ++i) {
			s1[i] = s.charAt(i);
			if(tmp != s1[i])e = false;
		}
		
		if(e)System.out.println(count);
		else {
			while(!e) {
				e = true;
				if(tmp == 'W')tmp = 'B';
				else tmp = 'W';
				
				for(int i = p; i < s.length(); ++i) {
					if(s1[i]!= tmp)s1[i] = tmp;
					else { 
						p = i;
						break;
					}
				}
				for(int i = p; i < s.length(); ++i) {
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
