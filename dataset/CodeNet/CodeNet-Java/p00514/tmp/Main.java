import java.util.*;
import java.math.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
System.out.println("[INST]5;a;s.nextInt();"+a);
		int b=s.nextInt();
System.out.println("[INST]6;b;s.nextInt();"+b);
		int c=s.nextInt();
System.out.println("[INST]7;c;s.nextInt();"+c);
		if(a*b>c){
			System.out.println(0);
			System.exit(0);
System.out.println("[INST]10;None;System.exit(0);"+System.exit(0));
		}
		c-=a*b;
		int d=c+a-1;
		BigInteger bi=new BigInteger("1");
		for(int i=0;i<c;i++){
			bi=bi.multiply(new BigInteger(""+(d-i)));
System.out.println("[INST]16;bi;bi.multiply(new BigInteger(''+(d-i)));"+bi);
			bi=bi.divide(new BigInteger(""+(i+1)));
System.out.println("[INST]17;bi;bi.divide(new BigInteger(''+(i+1)));"+bi);
		}
		System.out.println(bi.toString());
	}
}