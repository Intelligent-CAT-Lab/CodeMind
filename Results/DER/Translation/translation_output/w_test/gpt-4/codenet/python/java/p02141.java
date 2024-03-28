Here is your translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int a = (Math.min(W/2, x + w/2) + Math.max(-W/2, x - w/2));
        int b = (Math.min(H/2, y + h/2) + Math.max(-H/2, y - h/2));
        
        System.out.println((double)b/a);

        scanner.close();
    }
}
```

To execute this code, you must compile and run the `Main` class using a Java environment. Make sure to provide the test input in the format specified (as a single line of space-separated numbers) when prompted by the program. The code will then calculate and print out the expected output.

Given the test input:
```
6000 5000 20 10 400 300
```

The program will print out the expected output:
```
0.75
```
