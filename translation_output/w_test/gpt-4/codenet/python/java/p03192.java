Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class CountTwos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        int count = 0;
        
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '2') {
                count++;
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}
```

To run the test case with the input `1222`, compile and execute this Java class, enter the test input, and the expected output `3` will be printed to the console.
