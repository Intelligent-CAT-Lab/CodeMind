Here's the equivalent Java code for the given Python script with the sample test case:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anti = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        
        int l = Math.abs(anti - c);
        int m = Math.abs(b - d);
        
        if (anti == c) {
            System.out.println((anti + m) + " " + b + " " + (c + m) + " " + d);
        } else if (b == d) {
            System.out.println(anti + " " + (b + l) + " " + c + " " + (d + l));
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(anti + " " + d + " " + c + " " + b);
        }
    }
}
```

If you run this Java code with the sample test input "4 0 0 4", the expected output will be:

```
4 4 0 0
```
