import java.util.*;

public class p02470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sieve = new int[n+1];
        for(int i=2;i<=n;i++){
            sieve[i] = 1;
        }
        for(int i=2;i*i<=n;i++){
            if(sieve[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    sieve[j] = 0;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(sieve[i]==1){
                primes.add(i);
            }
        }
        int ans = n;
        for(int p:primes){
            if(n%p==0){
                ans = ans*(p-1)/p;
                while(n%p==0){
                    n/=p;
                }
            }
        }
        if(n>1){
            ans = ans*(n-1)/n;
        }
        System.out.println(ans);
    }
}