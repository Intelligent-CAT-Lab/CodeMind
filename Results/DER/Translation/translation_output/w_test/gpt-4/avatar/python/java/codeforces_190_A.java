Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                return;
            }
            System.out.println("Impossible");
            return;
        }
        
        int min, max;
        
        if (m > n) {
            min = m;
            max = n + m - 1;
        } else { 
            min = n;
            max = n + m - 1;
            if (m == 0) {
                max = n;
            }
        }

        System.out.println(min + " " + max);
    }
}
```

Remember to compile and run your Java code, and also feed the test input (e.g., 59 96) into the program to verify the expected output (e.g., 96 154). Java requires that the class name matches the filename, so you should save the above code into a file called `Main.java` if you want to run it without any modifications.
