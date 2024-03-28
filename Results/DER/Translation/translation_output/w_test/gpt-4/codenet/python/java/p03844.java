Here's the translated Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        String s = input.next();
        int B = input.nextInt();
        input.close();

        switch (s) {
            case "+":
                System.out.println(A + B);
                break;
            case "-":
                System.out.println(A - B);
                break;
            // Assuming you might want to handle other cases in the future
            // Since other operators are not specified in the original code
            // they are not implemented here.
            default:
                System.out.println("Unsupported operation");
                break;
        }
    }
}
```

To run this code, you would need to compile and execute the `Calculator` class. When you input "1 + 2", the expected output will be "3", as specified in your test case.
