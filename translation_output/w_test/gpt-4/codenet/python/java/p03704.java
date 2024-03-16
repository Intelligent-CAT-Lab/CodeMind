To translate the provided Python code to Java, it is important to recreate the logic of the function `f` and the overall structure in a way that makes sense for Java's syntax, which is statically typed and does not have list comprehensions. Here is the translated code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        sc.close();
        
        int result = 0;
        for (int i = 1; i <= 20; i++) {
            result += f(D, i, 0) * (10 - i % 2 * 9);
        }
        System.out.println(result);
    }
    
    public static int f(int d, int x, int y) {
        int n = (int)Math.pow(10, x + y-1);
        if (x < 1) {
            return d == 0 ? 1 : 0;
        }
        int sum = 0;
        for (int i = -9; i <= 9; i++) {
            if (Math.abs(d + i * n) < n) {
                sum += f(d + i * n, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1 ? 1 : 0));
            }
        }
        return sum;
    }
}
```

Please note a few important points about this translation:
1. In Java, there is no direct equivalent to the dynamic typing of lists in Python. We use integers to calculate the result.
2. Java uses explicit casting `(int)` to convert the result of `Math.pow` to an integer.
3. Java does not have a `sum` function on iterable objects like Python, so you need to write a loop to manually sum the values.
4. We use a `Scanner` to get user input from `System.in`, and it is standard practice to close the `Scanner` after use to release resources.
5. The loop in the `main` method and the `f` method are explicit in Java, unlike the list comprehensions in Python.
