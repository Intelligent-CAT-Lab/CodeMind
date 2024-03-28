Below is the Java equivalent of the provided Python code. The Java code uses a `Scanner` to read inputs from the console, applies the provided transformation within a loop, and prints the result using `System.out.println`.

```java
import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assuming the input is provided in the same order and format: 2 1 2
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        
        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
        
        scanner.close();
    }
}
```

When this Java code is run, it will ask for input in the form of three space-separated integers. Upon entering "2 1 2" and pressing enter, it will produce the expected output as specified:

```
3
5
9
17
33
65
129
257
513
1025
```
