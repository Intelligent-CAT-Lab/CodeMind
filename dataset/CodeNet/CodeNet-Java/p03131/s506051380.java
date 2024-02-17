import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long K = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        long sum = 1+K;
        if(A < B){
            long sum1 = 1;
            if(A > sum1){
                K -= (A-sum1);
                sum1 = A;
            }
            sum1 += (B-A)*(K/2);
            if(K%2 == 1)
                sum1 += 1;
            sum = Math.max(sum, sum1);
        }
        System.out.println(sum);
   }
}