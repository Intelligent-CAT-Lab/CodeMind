import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		String s=in.next();
System.out.println("[INST]8;s;in.next();"+s);
		int ans=0;
		for(int i=0;i<s.length();i++)
System.out.println("[INST]10;None;s.length();"+s.length());
		{
			if(i==s.length()-2) {
System.out.println("[INST]12;None;s.length();"+s.length());
				if(s.charAt(i)==s.charAt(i+1)) {
System.out.println("[INST]13;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]13;None;s.charAt(i+1);"+s.charAt(i+1));
					i++;
				}
			}else if(i!=s.length()-1){
System.out.println("[INST]16;None;s.length();"+s.length());
				if(s.charAt(i)==s.charAt(i+1)) {
System.out.println("[INST]17;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]17;None;s.charAt(i+1);"+s.charAt(i+1));
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
	
