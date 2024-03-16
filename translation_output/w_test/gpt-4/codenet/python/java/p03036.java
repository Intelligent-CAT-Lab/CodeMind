Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int r = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
        
        scanner.close();
    }
}
```

When given the test input of "2 10 20", this Java code will produce the expected output:

```
30
50
90
170
330
650
1290
2570
5130
10250
```
