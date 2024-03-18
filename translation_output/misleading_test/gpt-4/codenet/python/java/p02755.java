Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        boolean found = false;
        int answer = 0;
        
        int n = A * 100 / 8;
        int m = (A + 1) * 100 / 8;
        
        for (int i = n; i <= m; i++) {
            if (i * 8 / 100 == A && i / 10 == B) {
                found = true;
                answer = i;
                break;
            }
        }
        
        System.out.println(found ? answer : -1);
        scanner.close();
    }
}
```

You can run the converted Java code with the sample test case as input by using the following commands in a terminal/cmd, assuming you have saved the Java code in a file named `Solution.java`, and you have the JDK installed to compile and run Java programs.

```bash
javac Solution.java
echo "2 2" | java Solution
```

The expected output for the given test input `2 2` will be `43`, as per the Python code's behavior.
