Here's the equivalent Java code for the Python code you've provided:

```java
import java.util.Scanner;

public class DivisionDistribute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int q = n / m;
        int r = n % m;
        int[] a = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = q;
        }
        
        for (int i = 0; i < r; i++) {
            a[i] += 1;
        }
        
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
        
        scanner.close();
    }
}
```

To run a test case with the input "87 34", you would enter the following when prompted by the program:

```
87 34
```

The expected output would be:

```
2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 
```

Java code does not include the trailing "â– " that was present in the Python code; if that is required, it can be easily appended to the output by modifying the `System.out.print(a[i] + " ");` line to `System.out.print(a[i] + " ▁ ");`. However, it seems more like a typo or an encoding issue, so I kept it as a regular space character in the Java version.
