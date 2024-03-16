Here is the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class BatchScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();
        scanner.close();

        if (N % X != 0) {
            System.out.println((N / X) * T + T);
        } else {
            System.out.println((N / X) * T);
        }
    }
}
```

Now when you run this Java program and provide the test input "20 12 6", the program will output "12", which is the expected output for the provided test case.
