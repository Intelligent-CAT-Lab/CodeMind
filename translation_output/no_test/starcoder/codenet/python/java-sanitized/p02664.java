import java.util.*;
public class p02664 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++){
			if(b[i]=='?'){
				b[i]='D';
			}
		}
		System.out.println(new String(b));
	}
}