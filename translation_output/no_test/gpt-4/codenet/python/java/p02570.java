Here's the Python code translated into Java, assuming you want to read from standard input (e.g., the console):
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        int[] data = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            data[i] = Integer.parseInt(input[i]);
        }
        
        if ((data[0] / (double) data[1]) <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

Note that in Java, integer division truncates the decimal part. To mimic the Python behavior where the division operator produces a floating-point result when dividing integers, you need to cast one of the operands to `double` before performing the division as shown above (`(data[0] / (double) data[1])`).
