import java.util.*;
import java.math.*;
class Main{
	public static void main(String[]Z){
		Scanner cin=new Scanner(System.in);
		int r=cin.nextInt(),c=cin.nextInt(),a1=cin.nextInt(),a2=cin.nextInt(),b1=cin.nextInt(),b2=cin.nextInt();
System.out.println("[INST]5;r;cin.nextInt();"+r);
System.out.println("[INST]5;c;cin.nextInt();"+c);
System.out.println("[INST]5;a1;cin.nextInt();"+a1);
System.out.println("[INST]5;a2;cin.nextInt();"+a2);
System.out.println("[INST]5;b1;cin.nextInt();"+b1);
System.out.println("[INST]5;b2;cin.nextInt();"+b2);
		int x=Math.abs(a1-b1),y=Math.abs(a2-b2);
System.out.println("[INST]6;x;Math.abs(a1-b1);"+x);
System.out.println("[INST]6;y;Math.abs(a2-b2);"+y);
		x=Math.min(x,r-x);y=Math.min(y,c-y);
System.out.println("[INST]7;x;Math.min(x,r-x);"+x);
System.out.println("[INST]7;y;Math.min(y,c-y);"+y);
		int z=1,C=Math.min(x,y);
System.out.println("[INST]8;C;Math.min(x,y);"+C);
		if(x==r-x)z*=2;
		if(y==c-y)z*=2;
		BigInteger b=BigInteger.ONE;
		for(int i=0;i<C;i++)b=b.multiply(new BigInteger(String.valueOf(x+y-i))).divide(new BigInteger(String.valueOf(i+1)));
System.out.println("[INST]12;b;b.multiply(new BigInteger(String.valueOf(x+y-i))).divide(new BigInteger(String.valueOf(i+1)));"+b);
System.out.println("[INST]12;None;b.multiply(new BigInteger(String.valueOf(x+y-i)));"+b.multiply(new BigInteger(String.valueOf(x+y-i))));
System.out.println("[INST]12;None;String.valueOf(x+y-i);"+String.valueOf(x+y-i));
System.out.println("[INST]12;None;String.valueOf(i+1);"+String.valueOf(i+1));
		System.out.println(b.multiply(new BigInteger(String.valueOf(z))).mod(new BigInteger("100000007")));
	}
}