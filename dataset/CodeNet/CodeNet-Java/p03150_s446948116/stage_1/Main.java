import java.util.Scanner;
public class Main {
	static Scanner scan=new Scanner(System.in);
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static long lcm (int a, int b) {return a*b/gcd(a,b);}
	static int max(int a,int b) {return a>b?a:b;}
	static int min(int a,int b) {return a<b?a:b;}
	static long factorial(int i) {return i==1?1:i*factorial(i-1);}
	static int lower_bound(int a[],int key) {
		int low=0,high=a.length;
		while(low<high) {
			int mid=((high-low)/2)+low;
			if(a[mid]<=key)low=mid+1;
			else high=mid;
		}
		return high;
		}
	static int upper_bound(int a[],int key) {
		int low=0,high=a.length;
		while(low<high) {
			int mid=((high-low)/2)+low;
			if(a[mid]<key)low=mid+1;
			else high=mid;
		}
		return high;
		}
	static boolean isPrime (int n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2)if(n%i==0){return false;}
		return true;
	}
	static int upper_division(int a,int b) {
		if(a%b==0) {
			return a/b;
		}
		else {
			return a/b+1;
		}
	}
	static long lupper_division(long a,long b) {
		if(a%b==0) {
			return a/b;
		}
		else {
			return a/b+1;
		}
	}
	static long lmax(long a,long b) {return Math.max(a, b);}
	static long lmin(long a,long b) {return Math.min(a, b);}
	static int[] setArray(int a) {
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
var newVariable_0 = scan.nextInt();			b[i]=newVariable_0;
		}
		return b;
	}
	static String reverce(String str) {
		String strr="";
var newVariable_1 = str.length();		for(int i=newVariable_1-1;i>=0;i--) {
			strr+=str.charAt(i);
		}
		return strr;
	}
	public static void main(String[]args){
		String a=scan.next();
		boolean bool=false;
var newVariable_2 = a.charAt(0);var newVariable_3 = a.charAt(a.length()-1);var newVariable_4 = a.length();		if(a.charAt(0)!='k'||a.charAt(newVariable_4-1)!='e') {
var newVariable_5 = a.indexOf("keyence");			if(newVariable_5!=-1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			return;
		}
		
var newVariable_6 = a.length();		for(int i=0;i<newVariable_6;i++) {//一つ目の最初の場所
var newVariable_7 = a.length();			for(int j=i+1;j<=newVariable_7;j++) {//一つ目の最後
				String str1=a.substring(i,j);
var newVariable_8 = a.length();				for(int k=j;k<newVariable_8;k++) {
var newVariable_9 = a.length();					for(int l=k+1;l<=newVariable_9;l++)	{
						String str2=a.substring(k,l);
						String str=str1+str2;
var newVariable_10 = str.equals("keyence");						if(newVariable_10)bool=true;
					}
				}
			}
		}
		System.out.println(bool?"YES":"NO");
	}
}
