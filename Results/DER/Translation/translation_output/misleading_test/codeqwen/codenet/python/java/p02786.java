Here is the Java version of your Python code:

```java
public class Main {
    public static void main(String[] args) {
        int H = Integer.parseInt(System.console().readLine());
        System.out.println(atack(H));
    }

    public static int atack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + atack(tairyoku / 2) * 2;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the console, calls the `atack` function with this integer, and prints the result. The `atack` function is defined in the same class and behaves the same way as your Python function.
