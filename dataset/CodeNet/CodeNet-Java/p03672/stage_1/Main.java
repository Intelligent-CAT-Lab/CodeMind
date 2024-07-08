import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		String s1 = "";
		String s2 = "";
		
		String answer ="";
		
		
		
		for(int i = s.length();i>=2;i=i-2){
			String S = s.substring(0,i);
			
var newVariable_0 = S.length();			s1 = S.substring(0, newVariable_0/2);
var newVariable_1 = S.length();var newVariable_2 = S.length();			s2 = S.substring(newVariable_2/2, newVariable_2);
			
			
var newVariable_3 = s1.equals(s2);var newVariable_4 = S.length();var newVariable_5 = s.length();			if(s1.equals(s2)&&S.length()!=newVariable_5){
				answer =S;
				break;
			}
			
		}
		
		
		
		System.out.println(answer.length());
		
		
	}

}
