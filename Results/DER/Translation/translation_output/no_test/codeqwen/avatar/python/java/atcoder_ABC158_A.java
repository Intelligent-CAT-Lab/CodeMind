Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = (s.contains("A") && s.contains("B")) ? " Yes " : " No ";
        System.out.println(result);
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `contains` method is used to check if the string `s` contains the characters "A" and "B". If both characters are present, the result is " Yes ", otherwise it is " No ". The result is then printed to the console.
