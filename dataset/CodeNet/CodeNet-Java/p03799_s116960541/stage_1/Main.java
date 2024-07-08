import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();

        long res = 0;
        
        if(N*2>=M){
            res = M/2;
        }else{
            res = N+((M-2*N)/4);
        }

        
        System.out.println(res);
        
        }
    }