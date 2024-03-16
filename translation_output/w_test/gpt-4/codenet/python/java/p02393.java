Here is the Python code translated to Java:

```java
import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assuming the input will always have three integers as per the Python example
        int[] s = new int[3];
        
        for (int i = 0; i < 3; i++) {
            s[i] = scanner.nextInt();
        }
        
        Arrays.sort(s);
        
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
        
        scanner.close();
    }
}
```

You would run this Java code and provide an input like the example provided (3 8 1). This code would then output the three integers in ascending order (1 3 8).
