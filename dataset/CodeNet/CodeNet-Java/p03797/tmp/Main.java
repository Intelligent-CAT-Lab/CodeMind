import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong(),M=sc.nextLong(),sum=0;
System.out.println("[INST]4;N;sc.nextLong();"+N);
System.out.println("[INST]4;M;sc.nextLong();"+M);
			if(N*2>M){
			sum=M/2;
			}
			else if(M>N*2){
			sum=N;
			sum=sum+((M-N*2)/4);
			}
			System.out.println(sum);
	}
}