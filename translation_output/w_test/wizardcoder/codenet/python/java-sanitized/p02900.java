import java.util.*;

public class p02900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int gcd = gcd(A,B);
        List<Integer> prime_factor = primeFactorize(gcd);
        int ans = prime_factor.size();
        for(int i=0;i<(1<<prime_factor.size());i++){
            int composite = 1;
            int count = 0;
            for(int j=0;j<prime_factor.size();j++){
                if((i & (1<<j))!= 0){
                    composite *= prime_factor.get(j);
                    count++;
                }
            }
            if(count >= 2 && composite!= 1){
                ans--;
            }
        }
        System.out.println(ans+1);
    }
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static List<Integer> primeFactorize(int n){
        List<Integer> a = new ArrayList<>();
        while(n%2==0){
            a.add(2);
            n/=2;
        }
        int f=3;
        while(f*f<=n){
            if(n%f==0){
                a.add(f);
                n/=f;
            }
            else{
                f+=2;
            }
        }
        if(n!=1) a.add(n);
        return a;
    }
}