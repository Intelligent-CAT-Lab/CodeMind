Certainly! Here is the equivalent Java code to perform the same functionality as the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();

        int result = x - t > 0 ? x - t : 0;
        System.out.println(result);
    }
}
```

To run the above Java code with the given test input (100 17), you would execute the program and then type the input (100 17) when prompted. The program would then output the expected result, which in this case is 83.
