import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=s.charAt(0);
		int sum=0;
		for(int i=0;i<s.length();i++){
			if(c!=s.charAt(i)){
				sum++;
				c=s.charAt(i);
			}
		}
		System.out.print(sum);
	}
}
