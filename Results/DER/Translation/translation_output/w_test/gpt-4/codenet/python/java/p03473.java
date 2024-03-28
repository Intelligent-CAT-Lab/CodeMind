Below is the Java equivalent of the provided Python code, which reads an integer from the standard input and prints `48 - M`:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        System.out.println(48 - M);
        scanner.close();
    }
}
```

To run this code, you will need to compile it and then execute the compiled class. When prompted, you can input `21`, and the program will output `27`, as expected in the test case.
