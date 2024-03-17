Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        long n = input.nextInt();
        int w = input.nextInt();
        long sum = 0;

        for (int i = 1; i <= w; i++) {
            sum += (long)k * i;
        }
        
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
        
        input.close();
    }
}
```

To use the code, run this Java class with any standard Java environment. Provide the input in the format specified in the test case when prompted.
