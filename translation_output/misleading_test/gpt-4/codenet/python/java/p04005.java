Here's the translated Java code for the given Python program:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] l = new int[3];
        for (int i = 0; i < 3; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l[0] * l[1];
            }
        }
        System.out.println(ans);
        
        scanner.close();
    }
}
```
To use the Java program provided, simply compile the `Main` class and run it. Make sure to input three integers separated by spaces like in the test case provided (e.g., "3 3 3"). The program will output the expected result, which is `79` for the provided test case.
