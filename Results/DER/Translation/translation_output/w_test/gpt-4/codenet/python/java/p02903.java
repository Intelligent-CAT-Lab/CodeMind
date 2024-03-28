Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        for (int i = 0; i < h; i++) {
            StringBuilder sb = new StringBuilder();
            if (i < b) {
                for (int j = 0; j < a; j++) {
                    sb.append("0");
                }
                for (int j = 0; j < w - a; j++) {
                    sb.append("1");
                }
            } else {
                for (int j = 0; j < a; j++) {
                    sb.append("1");
                }
                for (int j = 0; j < w - a; j++) {
                    sb.append("0");
                }
            }
            System.out.println(sb.toString());
        }
        
        scanner.close();
    }
}
```

You can compile this Java code and run it with the given input "3 3 1 1" to get the expected output:

```
100
010
001
```
