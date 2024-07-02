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
System.out.println("[INST]29;d;Math.sqrt(n);"+d);
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
			b[i]=scan.nextInt();
System.out.println("[INST]54;None;scan.nextInt();"+scan.nextInt());
		}
		return b;
	}
	static String reverce(String str) {
		String strr="";
		for(int i=str.length()-1;i>=0;i--) {
System.out.println("[INST]60;None;str.length();"+str.length());
			strr+=str.charAt(i);
System.out.println("[INST]61;strr;str.charAt(i);"+strr);
		}
		return strr;
	}
	public static void main(String[]args){
		String a=scan.next();
System.out.println("[INST]66;a;scan.next();"+a);
		boolean bool=false;
		if(a.charAt(0)!='k'||a.charAt(a.length()-1)!='e') {
System.out.println("[INST]68;None;a.charAt(0);"+a.charAt(0));
System.out.println("[INST]68;None;a.charAt(a.length()-1);"+a.charAt(a.length()-1));
System.out.println("[INST]68;None;a.length();"+a.length());
			if(a.indexOf("keyence")!=-1) {
System.out.println("[INST]69;None;a.indexOf('keyence');"+a.indexOf("keyence"));
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			return;
		}
		
		for(int i=0;i<a.length();i++) {//一つ目の最初の場所
System.out.println("[INST]78;None;a.length();"+a.length());
			for(int j=i+1;j<=a.length();j++) {//一つ目の最後
System.out.println("[INST]79;None;a.length();"+a.length());
				String str1=a.substring(i,j);
System.out.println("[INST]80;str1;a.substring(i,j);"+str1);
				for(int k=j;k<a.length();k++) {
System.out.println("[INST]81;None;a.length();"+a.length());
					for(int l=k+1;l<=a.length();l++)	{
System.out.println("[INST]82;None;a.length();"+a.length());
						String str2=a.substring(k,l);
System.out.println("[INST]83;str2;a.substring(k,l);"+str2);
						String str=str1+str2;
						if(str.equals("keyence"))bool=true;
System.out.println("[INST]85;None;str.equals('keyence');"+str.equals("keyence"));
					}
				}
			}
		}
		System.out.println(bool?"YES":"NO");
	}
}
