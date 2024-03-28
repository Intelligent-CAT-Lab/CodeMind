Here's the translated Java code for the given Python code, along with the code to handle the test case input:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 1; i <= 50000; i++) {
            int p = (int)(i * 1.08); // Calculate 8% tax
            dic.put(p, i); // Store in dictionary
        }
        if (dic.containsKey(n)) {
            System.out.println(dic.get(n)); // Print the original price
        } else {
            System.out.println(":("); // Print sad face if not found
        }
        
        scanner.close();
    }
}
```

To test this Java program, input `432` (or the sample test case) into the program when it asks for input, and the expected output `400` will be printed to the screen if the test is successful. If the program doesn't find the exact price that after applying 8%, results in `n`, it will output `:(`.
