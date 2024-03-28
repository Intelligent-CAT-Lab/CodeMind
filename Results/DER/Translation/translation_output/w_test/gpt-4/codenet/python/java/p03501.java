Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // Calculate the minimum and print the result
        System.out.println(Math.min(A * N, B));
        
        // Close the scanner
        sc.close();
    }
}
```

To test this Java code with the input "7 17 120", you can compile and run the program. The Java code will take the input in the same format and produce the output "119", just as expected from the provided example.
