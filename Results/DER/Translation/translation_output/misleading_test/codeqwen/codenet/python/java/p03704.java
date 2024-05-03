Here is the Java version of the provided Python code:

```java
public class Main {
    public static void main(String[] args) {
        String D = System.console().readLine();
        System.out.println(sum(D, 1, 0) * (10 - 1 % 2 * 9));
    }

    public static int sum(String D, int x, int y) {
        int n = Integer.parseInt("9".repeat(x) + "0".repeat(y));
        return x < 1 ? 0 : (int) (f(D, x - 2, y + 1) * (10 - Math.abs(f(D, x - 2, y + 1)) - (y < 1)));
    }

    public static int f(String D, int x, int y) {
        int n = Integer.parseInt("9".repeat(x) + "0".repeat(y));
        int result = 0;
        for (int i = -9; i <= 9; i++) {
            if (Math.abs(Integer.parseInt(D) + i * n) < n) {
                result += f(D, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1));
            }
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the console, and then calls the `sum` function with this integer as the argument. The `sum` function then calls the `f` function with the same integer as the argument, and returns the result. The `f` function is a recursive function that calculates the sum of all possible values of `i` such that `abs(D + i * n) < n`. The `f` function is called with the same integer as the argument, and returns the result. The `sum` function then multiplies the result of `f` by `(10 - Math.abs(f) - (y < 1))` and returns the result. The `main` function then prints the result of `sum`.
