Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    private static final long MOD = 1000000007L;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        if (K < N) {
            System.out.println(0);
        } else {
            long ans = 1;
            for (int v = K; v > K - N; v--) {
                ans = (ans * v) % MOD;
            }
            System.out.println(ans);
        }
    }
}
```

To run the code, you need to have this in a file `Main.java`, and then compile it using a Java compiler (`javac Main.java`). After compilation, you can run it using the command `java Main` in a command line environment. Input the test case `2 3` when prompted, and the output should be `6`, as expected.
