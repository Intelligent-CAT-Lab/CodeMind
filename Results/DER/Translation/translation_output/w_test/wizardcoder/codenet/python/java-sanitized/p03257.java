import java.util.*;
import java.io.*;

public class p03257 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MM = 510;
        int M = 255;
        int U = 100000;
        boolean[] isPrime = new boolean[U+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i*i<=U; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=U; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for(int i=0; i<U+1; i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }
        int[][] A = new int[MM][MM];
        for(int n=0; n<MM; n++){
            if(n%2 == 0){
                for(int i=n/2; i<n/2+M && i<MM; i++){
                    A[n][i] = primes.get(n/2);
                }
                for(int i=MM+M-n/2; i<2*MM-n/2 && i<MM; i++){
                    A[n][i] = primes.get(MM+M-n/2);
                }
                for(int i=n/2+1; i<MM; i+=2){
                    A[n][i] = A[n][i-1]*primes.get(n/2);
                }
                for(int i=n/2+2; i<MM; i+=2){
                    A[n][i] = A[n][i-1]*primes.get(n/2+1);
                }
                for(int i=n/2+1; i<MM; i+=2){
                    A[n][i] += 1;
                }
            }
            else{
                for(int i=(n+1)/2; i<(n+1)/2+M && i<MM; i++){
                    A[n][i] = primes.get((n+1)/2);
                }
                for(int i=MM+M-(n-1)/2; i<2*MM-(n-1)/2 && i<MM; i++){
                    A[n][i] = primes.get(MM+M-(n-1)/2);
                }
                for(int i=(n+1)/2+1; i<MM; i+=2){
                    A[n][i] = A[n][i-1]*primes.get((n+1)/2);
                }
                for(int i=(n+1)/2+2; i<MM; i+=2){
                    A[n][i] = A[n][i-1]*primes.get((n+1)/2+1);
                }
                for(int i=(n+1)/2+1; i<MM; i+=2){
                    A[n][i] += 1;
                }
            }
        }
        A = Arrays.copyOfRange(A, 1, N+1);
        for(int i=0; i<A.length; i++){
            A[i] = Arrays.copyOfRange(A[i], 1, N+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                sb.append(A[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}