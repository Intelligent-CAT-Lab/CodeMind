import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long K = sc.nextLong();
System.out.println("[INST]7;K;sc.nextLong();"+K);
        long A = sc.nextLong();
System.out.println("[INST]8;A;sc.nextLong();"+A);
        long B = sc.nextLong();
System.out.println("[INST]9;B;sc.nextLong();"+B);
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
System.out.println("[INST]22;sum;Math.max(sum, sum1);"+sum);
        }
        System.out.println(sum);
   }
}