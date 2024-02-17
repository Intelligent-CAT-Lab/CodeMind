import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		String s=in.next();
		int ans=0;
		for(int i=0;i<s.length();i++)
		{
			if(i==s.length()-2) {
				if(s.charAt(i)==s.charAt(i+1)) {
					i++;
				}
			}else if(i!=s.length()-1){
				if(s.charAt(i)==s.charAt(i+1)) {
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
	
