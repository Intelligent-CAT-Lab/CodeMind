Here is the translated Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if ((a < c && c < b) || (a > c && c > b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

To use this code, you will need to create a class file, for example, `Main.java`, and add the Java code provided above to it. You can compile the code using `javac Main.java` and then run it with `java Main`. When running the program, you enter the test input (e.g., `3 8 5`) in the console, and it should output "Yes" as expected.
