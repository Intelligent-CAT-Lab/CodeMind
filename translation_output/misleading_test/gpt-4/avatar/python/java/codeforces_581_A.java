Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        int[] x = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            x[i] = Integer.parseInt(input[i]);
        }
        
        int a = x[0];
        int b = x[1];
        
        System.out.print(Math.min(a, b) + " ▁ ");
        
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}
```
Please note the differences in how input is handled in Java versus Python and how printing is done. In Java, I used `System.out.print` and `System.out.println` for output, and the division operator "/" naturally performs integer division when both operands are integers.
