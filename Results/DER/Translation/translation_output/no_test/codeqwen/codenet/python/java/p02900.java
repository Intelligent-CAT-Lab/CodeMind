Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int gcd = gcd(A, B);
        List<Integer> primeFactor = primeFactorize(gcd);
        
        int ans = primeFactor.size();
        for (int i = 0; i < (int)Math.pow(2, primeFactor.size()); i++) {
            int i_temp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            while (i_temp != 0) {
                if (i_temp % 2 == 0) {
                    pass();
                } else if (i_temp % 2 == 1) {
                    composite *= primeFactor.get(j);
                    count += 1;
                }
                j += 1;
                i_temp /= 2;
            }
            
            for (int j : primeFactor) {
                if (j == composite && count >= 2) {
                    ans -= 1;
                }
            }
        }
        
        System.out.println(ans + 1);
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
    
    public static
