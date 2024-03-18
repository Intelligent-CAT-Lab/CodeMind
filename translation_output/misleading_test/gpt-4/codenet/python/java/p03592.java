Here is the translation of the provided Python code to Java:

```java
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        String ans = "No";

        // Performing calculations
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int o = i * j + (m - j) * (n - i);
                int x = n * m - o;
                if (o == k || x == k) {
                    ans = "Yes";
                }
            }
        }
        
        // Printing the result
        System.out.println(ans + "M");
        scanner.close();
    }
}
```

To check this with the provided test case, you would input:

```
2 2 2
```

And the expected output should be:

```
YesM
``` 

Remember to close the scanner after usage to avoid any resource leak. The `+ "M"` is added when printing out the result to match the asked for output format, appending an "M" at the end.
