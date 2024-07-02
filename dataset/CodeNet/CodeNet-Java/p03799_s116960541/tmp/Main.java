import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
System.out.println("[INST]4;N;sc.nextLong();"+N);
        long M = sc.nextLong();
System.out.println("[INST]5;M;sc.nextLong();"+M);

        long res = 0;
        
        if(N*2>=M){
            res = M/2;
        }else{
            res = N+((M-2*N)/4);
        }

        
        System.out.println(res);
        
        }
    }