Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(Math.max(String.valueOf(i).length(), String.valueOf(n / i).length()));
            }
        }
        System.out.println(result.stream().min(Integer::compare).orElse(0));
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the console, calculates the factors of the number, and then finds the maximum length of the string representation of each factor. The minimum of these maximum lengths is printed to the console.
