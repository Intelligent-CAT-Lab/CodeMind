Here is the Java version of your Python code:

```java
public class Main {
    public static void main(String[] args) {
        Integer[] g = new Integer[50];
        Integer[] h = new Integer[50];
        h[1] = 3;
        g[1] = 6;
        int X = Integer.parseInt(System.console().readLine());
        for (int i = 2; i <= X; i++) {
            h[i] = g[i-1] + 1;
            g[i] = 2*h[i];
        }
        System.out.println(g[X]);
    }
}
```

Please note that in Java, we use `Integer` instead of `None` to represent null values. Also, Java does not have a built-in function to read input from the console like Python's `input()`. Instead, we use `System.console().readLine()` to read a line of text from the console.
