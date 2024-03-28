Here's the translated version of the provided Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int x = a;
        int h = 0;
        int s = 0;
        
        while (x > 0) {
            x -= 1;
            h += 1;
            s += 1;
        }
        
        while (s / b != 0) {
            h += 1;
            s = s - b + 1;
        }
        
        System.out.println(h);
    }
}
```

The Java code above should give the same logical result as the provided Python script. Remember to run the Java code within a class and the appropriate input method, as Java requires these structured elements.
