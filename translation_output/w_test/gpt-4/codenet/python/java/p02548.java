Here's the Java translation of the given Python code including the main method to read from the console:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cnt = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int x = a * b;
                if (x >= n) {
                    break;
                }
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
```

This Java program uses `Scanner` to read the input `n` from the console, then computes the count `cnt` in a similar manner as the Python code, and finally prints the result to the console.
