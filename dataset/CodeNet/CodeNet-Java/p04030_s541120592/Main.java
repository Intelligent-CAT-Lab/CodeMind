import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = "";
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='B'){
				if(t.length()!=0) t = t.substring(0, t.length()-1);
			}
			else t += s.charAt(i);
		}
		System.out.println(t);
	}
}