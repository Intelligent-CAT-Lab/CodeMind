Here is the Java equivalent of your Python code:

```java
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        if (n < 1000) {
            System.out.println("ABC");
        } else {
            System.out.println("ABD");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it is less than 1000, and prints "ABC" if it is, or "ABD" if it isn't.
