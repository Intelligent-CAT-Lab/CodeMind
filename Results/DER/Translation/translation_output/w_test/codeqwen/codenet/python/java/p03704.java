Here is the Java version of the provided Python code:

```java
public class Main {
    public static void main(String[] args) {
        String D = System.console().readLine();
        System.out.println(sum(D, 1, 0));
    }

    public static int sum(String D, int x, int y) {
        int n = (int) Math.pow(10, x) + (int) Math.pow(10, y);
        return x < 1 ? 0 : (int) (f(D, x - 2, y + 1) * (10 - Math.abs(f(D, x - 2, y + 1)) - (y < 1)));
    }

    public static int f(String D, int x, int y) {
        int n = (int) Math.pow(10, x) + (int) Math.pow(10, y);
        return D.length() == 0 ? 0 : (int) (f(D.substring(1), x - 2, y + 1) * (10 - Math.abs(f(D.substring(1), x - 2, y + 1)) - (y < 1)));
    }
}
```

This Java code does the same thing as the Python code. It reads an input from the console, converts it to an integer, and then calls the `sum` function with this integer as the argument. The `sum` function then calls the `f` function with the same arguments and returns the result. The `f` function is similar to the `f` function in the Python code, but it uses Java's `substring` method to remove the first character of the input string.
