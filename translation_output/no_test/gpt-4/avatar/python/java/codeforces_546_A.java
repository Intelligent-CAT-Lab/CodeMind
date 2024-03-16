Below is the translation of the given Python code into Java:

```java
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
        
        scanner.close();
    }
}
```

Make sure to run this code within a class, and keep in mind that in Java you need to import the `Scanner` class in order to use it. Also, Java requires that all statements must be inside a class and method. In our case, we've put our code inside a `main` method of a `Main` class. Note that the Java program reads from standard input like the `input()` function in Python, and prints the output to the console using `System.out.println`.
