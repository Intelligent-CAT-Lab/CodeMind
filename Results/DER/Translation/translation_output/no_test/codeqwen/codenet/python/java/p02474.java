Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        System.out.println(Integer.parseInt(a[0]) * Integer.parseInt(a[1]));
    }
}
```

In this Java code, we use `Scanner` to read the input from the user. The `nextLine()` method reads the entire line of input, and the `split(" ")` method splits the line into an array of strings based on spaces. The `Integer.parseInt(a[0])` and `Integer.parseInt(a[1])` convert the strings in the array to integers. The `*` operator is then used to multiply the two integers, and the result is printed to the console.
