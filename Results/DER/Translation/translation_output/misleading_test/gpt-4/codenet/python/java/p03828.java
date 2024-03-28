Below is the translated Java code for the provided Python script. The code defines a `main` method to read the input, a `countFactors` method to count the occurrences of each factor, and then computes the final answer by iterating over the stored factors.

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class FactorCount {
    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextInt();
        scanner.close();
    
        Map<Long, Integer> count = new HashMap<>();
        long ans = 1;
        ArrayList<Long> num = new ArrayList<>();

        for (long i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (long n : num) {
                long tempI = i;
                while (tempI % n == 0) {
                    count.put(n, count.get(n) + 1);
                    tempI /= n;
                }
                if (tempI == 1) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                num.add(i);
                count.put(i, 1);
            }
        }
        
        for (int n : count.values()) {
            ans = ans * (n + 1) % MOD;
        }
        System.out.println(ans);
    }
}
```

To run the Java code, you will need to compile it first using a Java compiler such as `javac` and then execute the compiled class file. Assuming this code is saved in a file called `FactorCount.java`, you can compile and run it as follows:
```bash
javac FactorCount.java
java FactorCount
```

Then you supply the input `3` and you should get the expected output `77`, as in the sample test case provided.
