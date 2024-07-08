import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=s.charAt(0);
		int sum=0;
var newVariable_0 = s.length();		for(int i=0;i<newVariable_0;i++){
var newVariable_1 = s.charAt(i);			if(c!=newVariable_1){
				sum++;
				c=s.charAt(i);
			}
		}
		System.out.print(sum);
	}
}
