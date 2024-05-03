Here is the Java equivalent of the Python code you provided:

```java
public class Main {
    public static void main(String[] args) {
        String input = System.console().readLine();
        String output = "2018" + input.substring(4);
        System.out.println(output);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, concatenates it with "2018", and then prints the result. The `System.console().readLine()` method is used to read a line of input from the user, and the `substring(4)` method is used to get the substring of the input starting from the 5th character (since string indices in Java start at 0).
