Here is your Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (0 < a && a < 10 && 0 < b && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println("-1");
        }
        
        sc.close();
    }
}
```

This Java program assumes that the input will be given in the same way as your Python test case (two integers entered on the same line separated by a space). If you want to run this code, simply place it within a Java file (for example, `Main.java`), compile it using a Java compiler, and run it with a Java runtime environment.
