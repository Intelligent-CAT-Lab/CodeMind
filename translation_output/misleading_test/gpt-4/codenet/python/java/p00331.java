Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int H = scanner.nextInt();
        int R = scanner.nextInt();
        
        if (H >= 0) {
            System.out.println(1);
        } else {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
        
        scanner.close();
    }
}
```

To run the above Java program, you can compile it and then run it, passing `-3 3` as input, and it should print `-60` as the expected output. However, based upon the logic provided in the translated Python code, running the program with `-3 3` as the provided test input would actually output a `1`, since the if-else structure leads to the output of `1` in both cases where `H >= 0` or `H + R > 0`. As such, the claim that the expected output is `-60` does not correspond to the logic in the code nor its translation to Java. If the expected output is indeed `-60`, the Python code logic may need to be revised to fit the described outcome.
