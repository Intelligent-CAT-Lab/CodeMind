Below is the translated Java code that accomplishes the same task as the provided Python code:

```java
import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (b <= a) {
            System.out.println("delicious");
        } else if ((b - a) <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
        
        scanner.close();
    }
}
```

To compile and run this code, save it to a file named `Evaluation.java`. Then use `javac Evaluation.java` to compile it and `java Evaluation` to run it. When running the program, it will wait for you to enter input like the test input given (`4 3 6`), and then it will produce the expected output ('safe').
