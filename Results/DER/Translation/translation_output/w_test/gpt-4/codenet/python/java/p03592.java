Here is the translated Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        
        String ans = "No";
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int o = i * j + (m - j) * (n - i);
                int x = n * m - o;
                if (o == k || x == k) {
                    ans = "Yes";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
```

Here's how the code works:

- First, integers `n`, `m`, and `k` are read from standard input using a `Scanner` object.
- Then a nested loop equivalent to the one in the Python code is created. 
- Within the inner loop, the conditions that check if either `o` or `x` equals `k` are evaluated.
- If either condition is true, we set `ans` to "Yes" and break out of the inner loop.

Keep in mind that Java starts its class definition with a class name (`Main` in this example) and includes all the code within the main method. You also need to properly handle input and manage resources such as closing the `Scanner` object after use.

When you run this Java code with the input `2 2 2`, the expected output will be "Yes", just like in the Python version.
