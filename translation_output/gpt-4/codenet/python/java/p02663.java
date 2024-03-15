Below is the equivalent Java code, which reads five integers from standard input, performs the calculation, and prints the result:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int k = scanner.nextInt();
        
        int t1 = 60 * h1 + m1;
        int t2 = 60 * h2 + m2;
        
        System.out.println(t2 - t1 - k);
        
        scanner.close();
    }
}
```

This code snippet assumes that the class is called `Main`. It uses `Scanner` to read input from `System.in`. We read five integers, calculate the corresponding minutes for the start time (t1) and end time (t2), then print out the difference between t2 and t1 minus k.
