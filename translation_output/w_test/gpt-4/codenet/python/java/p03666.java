Here is the translation of the given Python code into Java. The code reads a line of input, splits it into integers, and then uses a for loop to check the given condition. If the condition is satisfied, it prints "YES" and breaks the loop. If the loop completes without breaking, "NO" is printed.

```java
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        
        int N = Integer.parseInt(inputs[0]);
        int A = Integer.parseInt(inputs[1]);
        int B = Integer.parseInt(inputs[2]);
        int C = Integer.parseInt(inputs[3]);
        int D = Integer.parseInt(inputs[4]);
        
        boolean found = false;
        
        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D * k - C * j >= B - A && B - A >= C * k - D * j) {
                System.out.println("YES");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```

To use this code, you would run the `MyClass` program and input the test case "5 1 5 2 4" (without quotes). This will produce the expected output "YES".
