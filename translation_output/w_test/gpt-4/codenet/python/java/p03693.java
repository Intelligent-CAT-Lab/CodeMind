Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class RGBDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        
        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

To compile and run this Java program, you would typically save it in a file named `RGBDivisibility.java`, compile it with `javac RGBDivisibility.java`, and then run it with `java RGBDivisibility`. When the program runs, you would then input the numbers in the console similar to the provided test input:

Input:
```
4 3 2
```

Expected Output:
```
YES
```
