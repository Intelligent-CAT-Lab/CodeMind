import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int result = 0;
        int a = 0;

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                a =gcd(i, j);
                for(int k=1; k<=N; k++){
                    result += gcd(a, k);
                }
            }
        }
        System.out.println(result);
    }

    public static int gcd(int p, int q){
        if(p % q == 0){
            return q;
        }
        return gcd(q, p%q);
    }
}