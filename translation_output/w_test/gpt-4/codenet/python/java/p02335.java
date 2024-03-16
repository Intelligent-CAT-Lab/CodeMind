Here is the equivalent Java code for the provided Python program:

```java
import java.util.Scanner;

public class BallAndBox5 {
    private static final int MOD = (int) Math.pow(10, 9) + 7;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        input.close();
        
        System.out.println(n < k ? C(k, n) % MOD : (n > k ? 0 : 1));
    }
    
    private static long P(int n, int r) {
        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i);
        }
        return result;
    }
    
    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    
    private static long C(int n, int r) {
        return P(n, r) / factorial(r);
    }
    
    // H function is not used in this problem.
    // It could be implemented if needed for a different case.
    // private static long H(int n, int r) {
    //     return C(n + r - 1, r);
    // }
}
```

To run the program, you can compile it using `javac BallAndBox5.java` and then execute it with `java BallAndBox5`. It will wait for input that you should provide in the format "3 5" and then press Enter to get the output "10", which matches the Python program's test case.
