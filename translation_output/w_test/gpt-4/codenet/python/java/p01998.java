Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int root = (int) Math.sqrt(n) + 1;
        boolean[] isPrime = new boolean[n + 3];
        Arrays.fill(isPrime, true);
        
        for (int i = 4; i < n + 3; i += 2) {
            isPrime[i] = false;
        }
        
        int ans = 0;
        int prePrime = -1;
        for (int i = 3; i < n + 3; i += 2) {
            if (isPrime[i]) {
                if (prePrime + 2 == i) {
                    ans += 2;
                }
                
                prePrime = i;
                if (i > root) {
                    continue;
                }
                for (int j = i * i; j < n + 3; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(ans);
    }
}
```

You can compile and run this Java program to get the desired output for the provided test input. To compile, you can use `javac Main.java`, and to run, you would use the command `java Main`. When prompted, enter the test input (in this case, `3`), and the program will produce the expected output `2`.
