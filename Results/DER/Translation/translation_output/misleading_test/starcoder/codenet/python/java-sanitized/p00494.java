import java.util.*;
public class p00494 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		int i=ans=0;
		while(i<l){
			int lenj=leno=leni=0;
			while(i<l && s.charAt(i)=='J')
				lenj++,i++;
			while(i<l && s.charAt(i)=='O')
				leno++,i++;
			while(i<l && s.charAt(i)=='I')
				leni++,i++;
			if(lenj>=leno && leni>=leno)
				ans=Math.max(ans,leno);
		}
		System.out.println(ans);
	}
}