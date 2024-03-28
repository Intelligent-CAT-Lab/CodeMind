Below is the Python code translated into Java:

```java
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] l = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        
        Arrays.sort(l);
        
        int result = Math.abs((l[0] + l[3]) - (l[1] + l[2]));
        System.out.println(result);
        
        scanner.close();
    }
}
```

This Java code assumes the input is provided on a single line with space-separated integer values, similar to the test input provided. The `Scanner` class is used to read the input from STDIN, and the `Arrays` class to sort the array. After computing the absolute difference according to the logic in the original Python code, the result is printed to STDOUT.
