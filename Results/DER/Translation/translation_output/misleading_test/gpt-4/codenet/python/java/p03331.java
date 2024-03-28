Certainly! Here is the equivalent Java code for the Python script you provided:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        long ans = 1000000000000L;
        
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sum_N(i) + sum_N(N - i));
        }
        
        System.out.println(ans);
    }
    
    public static int sum_N(int x) {
        int total = 0;
        while (x > 0) {
            total += x % 10;
            x = x / 10;
        }
        return total;
    }
}
```

Please note that I've used `long` type for the variable `ans` to accommodate the large initial value (`1000000000000L`) in Java, similar to the original Python code. Also, I used `BufferedReader` to read from the standard input stream, which is commonly used for input in Java. Make sure to handle exceptions properly in a real-world application, but for this conversion example, I've simply added `throws IOException` declaration to the `main` method signature.
