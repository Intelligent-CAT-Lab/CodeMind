import java.util.*;
public class p03241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MN = M/N;
        int[] divisors = new int[M];
        int max_gcd = 0;
        for(int i=1; i<=M; i++) {
            divisors[i-1] = i;
        }
        for(int i=1; i<=M; i++) {
            for(int j=i; j<=M; j+=i) {
                divisors[j-1] = j;
            }
        }
        for(int i=0; i<M; i++) {
            if(divisors[i]<=MN && divisors[i]>=max_gcd) {
                max_gcd = divisors[i];
            }
        }
        System.out.println(max_gcd);
    }
}