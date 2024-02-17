import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static long mod = 1000000007;
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	long N = s.nextLong();
	long result = 1;
	long src = 1;
	for(int i = 0; i < N; i++){
		result = (result*10)%mod;
		src = (src*9)%mod;
	}
	result = (((result-src)%mod)*2)%mod;


	long result2 = 1;
	long src2 = 1;
	for(int i = 0; i < N; i++){
		result2 = (result2*10)%mod;
		src2 = (src2*8)%mod;
	}
	result2 = (result2-src2)%mod;
	result = (result-result2)%mod;

	if(result<0){
		System.out.println(result%mod+mod);
	}else{
		System.out.println(result%mod);
	}
	
    
  }
}