import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Change
public class Main{
	Scanner sc=new Scanner(System.in);

	long M;
	int rD, rR;
	long cD, cR;

	void run(){
		M=sc.nextLong();
System.out.println("[INST]17;M;sc.nextLong();"+M);
		rD=sc.nextInt();
System.out.println("[INST]18;rD;sc.nextInt();"+rD);
		rR=sc.nextInt();
System.out.println("[INST]19;rR;sc.nextInt();"+rR);
		cD=sc.nextLong();
System.out.println("[INST]20;cD;sc.nextLong();"+cD);
		cR=sc.nextLong();
System.out.println("[INST]21;cR;sc.nextLong();"+cR);
		solve();
	}

	void solve(){
		long max=-1;
		long D0=(100*cD+rD-1)/rD, C0=(100*cR+rR-1)/rR;
		for(int i=0; i<100; i++){
			for(int j=0; j<100; j++){
				long changeD=D0+i, changeR=C0+j;
				long jpn=M-changeD-changeR;
				if(jpn<0){
					continue;
				}
				long remD=changeD*rD/100-cD;
				long remR=changeR*rR/100-cR;
				jpn+=remD*100/rD+remR*100/rR;
				max=max(max, jpn);
System.out.println("[INST]38;max;max(max, jpn);"+max);
			}
		}
		println(max+"");
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}