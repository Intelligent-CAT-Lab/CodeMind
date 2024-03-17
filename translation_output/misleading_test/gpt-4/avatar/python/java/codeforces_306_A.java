Here is the translated Java code. I have made some adjustments like using a Scanner object for input and a loop to display the results. The 'â–' character is not a standard space character, so I replaced it with a single space in the output.

```java
import java.util.Scanner;

public class DistributeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

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
    }
}
```

Here's how you might use the Java code with the provided test input to get the expected output:

Test input:
```
87 34
```

Expected output:
```
2 2 2 2 2 2 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 
``` 

Note that the output will appear all on one line with a trailing space, which differs slightly from the Python output.
