Here's the equivalent Java code for the provided Python program:

```java
import java.util.Scanner;

public class FibonacciSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        System.out.println(search(x, y));
    }

    private static int search(int x, int y) {
        int x_min = 0;
        int y_min = 0;
        int x_max = 0;
        int y_max = 0;
        int f = 0;
        int f1 = 1;
        int f2 = 0;
        int p = 0;
        
        while(true) {
            if (x_min <= x && x <= x_max && y_min <= y && y <= y_max)
                return p % 3 + 1;
            
            f = f1 + f2;
            
            switch (p % 4) {
                case 0: x_max += f; break; // east
                case 1: y_max += f; break; // north
                case 2: x_min -= f; break; // west
                case 3: y_min -= f; break; // south
            }
            
            f2 = f1;
            f1 = f;
            p++;
        }
    }
}
```

This Java code takes an input from the user and prints the output, similarly to the Python program. To compile and run this program, make sure to put it in a file named `FibonacciSearch.java` and execute the following commands:

```
javac FibonacciSearch.java
java FibonacciSearch
```

Then enter your input, for example "0 0", and you should see the expected output "1".
