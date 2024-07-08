import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		String s=in.next();
		int ans=0;
var newVariable_0 = s.length();		for(int i=0;i<newVariable_0;i++)
		{
var newVariable_1 = s.length();			if(i==newVariable_1-2) {
var newVariable_2 = s.charAt(i);var newVariable_3 = s.charAt(i+1);				if(s.charAt(i)==newVariable_3) {
					i++;
				}
var newVariable_4 = s.length();			}else if(i!=newVariable_4-1){
var newVariable_5 = s.charAt(i);var newVariable_6 = s.charAt(i+1);				if(s.charAt(i)==newVariable_6) {
					i++;
					ans++;
					i++;
				}
			}
			ans++;
		}

		System.out.println(ans);
			
	}
}
	
