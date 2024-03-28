Here's the Java translation of the provided Python code including a sample test case:

```java
import java.util.Scanner;

public class RatingChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Test input: 1199

        if(n < 1200){
            System.out.println("ABC"); // Expected output for this test case: ABC
        } else if(n < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
        
        scanner.close();
    }
}
```

Please note that in the Python code, you provided `BC` as expected output for input `1199`, but based on the if-else conditions, the output should be `ABC` for any input less than `1200`. If `BC` is the desired output, the Python code might be incorrect or incomplete. Assuming that `ABC` is the correct output for input less than `1200` as per the given conditions, the above Java code follows that logic. If you actually need `BC` specifically for some reason, please confirm, and I can adjust the Java code accordingly.
