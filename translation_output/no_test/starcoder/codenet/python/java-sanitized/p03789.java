import java.util.*;
public class p03789 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int lb=0,ub=n;
		while(ub-lb>1){
			int mid=(lb+ub)/2;
			if(check(s,mid)){
				ub=mid;
			}else{
				lb=mid;
			}
		}
		System.out.println(ub);
	}
	public static boolean check(String s,int x){
		int g=0;
		for(int i=0;i<s.length();i++){
			x-=(x+g-s.charAt(i)-'0')%10;
			if(x<0)
				return false;
			g=(x+g)/10;
		}
		return true;
	}
}