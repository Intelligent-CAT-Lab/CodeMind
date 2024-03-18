Here's the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        
        int sn = 0;
        for (int i = 0; i < n.length(); i++) {
            sn += Integer.parseInt(n.substring(i, i + 1));
        }

        if (Integer.parseInt(n) % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user similar to the `input()` function in Python. We iterate over each character in the `String` `n`, computing the sum of its digits. Then we check if `n` is divisible by the sum of its digits (`sn`) and print the result accordingly.

To use the above code in a Java environment, you should have the `Main` class saved in a file called `Main.java` and have a Java Development Kit (JDK) installed to compile and run the program.
