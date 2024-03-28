Here is the Java equivalent for the Python code you've provided, along with a class and main method to read input from the console (it's assumed that inputs are separated by spaces):

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int f = scanner.nextInt();
        scanner.close();

        int x3 = d - f + s;
        int y3 = f + d - a;
        int x4 = a - f + s;
        int y4 = s + d - a;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```

To run this Java code, you would need to compile it using `javac` and then run it with `java`, providing space-separated values as standard input, just like in the test case you've provided.
