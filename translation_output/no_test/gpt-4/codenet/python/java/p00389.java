Here is the equivalent Java code for the given Python program. Note that in Java, you'll have to use a `Scanner` object to handle the input and explicit data types for all variables:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int t = 1;
        int n, a = 1;
        
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) {
                break;
            }
            t += 1;
        }
        System.out.println(t);
        
        sc.close();
    }
}
```

Be mindful of integer division in Java: when dividing two integers, Java automatically floors the result, which is the intended behavior in the original Python code (`//` operator).
