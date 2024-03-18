Certainly! Below is the translation of the given Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (Math.abs(a - b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a - b) - w);
        }
        
        scanner.close();
    }
}
```

To compile and run this Java code, you would typically save it into a file named `Main.java`, then use `javac Main.java` to compile it, and `java Main` to run the program. When prompted, you would input "3 2 6" (without quotes) and press Enter, and the output would be "81" as expected.
