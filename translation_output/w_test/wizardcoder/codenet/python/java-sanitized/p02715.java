import java.math.BigInteger;
import java.util.Scanner;

public class p02715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        BigInteger P = BigInteger.valueOf(1000000007);
        BigInteger[] X = new BigInteger[K+1];
        BigInteger ans = BigInteger.ZERO;
        for(int i=1; i<=K; i++){
            X[i] = BigInteger.valueOf(i);
            for(int j=i*2; j<=K; j+=i){
                X[j] = X[j].subtract(X[i]);
            }
            ans = ans.add(X[i].multiply(BigInteger.valueOf(K/i).pow(N)));
        }
        System.out.println(ans.mod(P));
    }
}