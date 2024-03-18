Certainly! Below is the equivalent Java code for the provided Python code. When running this code in Java, input is typically gathered from command line arguments or using a `Scanner` object for console input. In this example, I'm using `Scanner` to read an integer from the standard input:

```java
import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) Math.sqrt(n);
        System.out.println(a * a);
    }
}
```

To compile and run the Java program, you'd save it in a file called `SquareArea.java`, compile with `javac SquareArea.java`, and execute with `java SquareArea`. When prompted, you would type in the integer input (for the test case, `10`), and the program would output `28`.
