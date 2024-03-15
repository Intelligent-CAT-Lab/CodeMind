Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class RepeatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        
        if (a <= b) {
            System.out.println(new String(new char[b]).replace("\0", Integer.toString(a)));
        } else {
            System.out.println(new String(new char[a]).replace("\0", Integer.toString(b)));
        }
        
        scanner.close();
    }
}
```

This Java code performs the same function as the provided Python code. It reads two integers from the user input, compares them, and prints the lower integer repeated 'higher integer' number of times. Note that in Java, there's no direct counterpart for Python's `str(a) * b`, so I used a workaround by creating a character array of the specified length (`new char[b]` or `new char[a]`) and then replacing each null character (`\0`) with the desired number repeated as a string (`Integer.toString(a)` or `Integer.toString(b)`).
