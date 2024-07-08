import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = "";
var newVariable_0 = s.length();		for(int i=0; i<newVariable_0; i++){
var newVariable_1 = s.charAt(i);			if(newVariable_1=='B'){
var newVariable_2 = t.length();var newVariable_3 = t.length();				if(newVariable_3!=0) t = t.substring(0, newVariable_3-1);
			}
			else t += s.charAt(i);
		}
		System.out.println(t);
	}
}