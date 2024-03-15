import java.util.*;

public class p02900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int gcd = gcd(A, B);
        List<Integer> primeFactor = primeFactorize(gcd);
        
        int ans = primeFactor.size();
        for (int i = 0; i < (int) Math.pow(2, primeFactor.size()); i++) {
            int i_temp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            while (i_temp != 0) {
                if (i_temp % 2 == 0) {
                    continue;
                } else {
                    composite *= primeFactor.get(j);
                    count++;
                }
                j++;
                i_temp /= 2;
            }
            
            for (int j : primeFactor) {
                if (j == composite && count >= 2) {
                    ans--;
                }
            }
        }
        
        System.out.println(ans + 1);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    
    public static List<Integer> primeFactorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }
}