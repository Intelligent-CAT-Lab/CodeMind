import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
var newVariable_0 = s.length();		for(int i=newVariable_0-2; i>=1; i-=2){
var newVariable_1 = s.substring(0, i/2).equals(s.substring(i/2,i));var newVariable_2 = s.substring(0, i/2);var newVariable_3 = s.substring(i/2,i);			if(s.substring(0, i/2).equals(newVariable_3)){
				System.out.println(i);
				break;
			}
		}
	}
}