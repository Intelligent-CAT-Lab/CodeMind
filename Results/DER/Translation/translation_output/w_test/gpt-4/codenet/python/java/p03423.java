Below is the Java equivalent of the given Python code. To read an input from the user, you would use `Scanner` provided by `java.util` package. Here's how you can achieve the same functionality:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number / 3);
        scanner.close();
    }
}
```

When you run this Java program and input the number 8, it will output 2, because `8 / 3` equals `2` when using integer division in Java, just as `//` denotes integer division in Python.
