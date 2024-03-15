Here's the equivalent Java code of the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] i = new int[input.length];
        
        for (int j = 0; j < input.length; j++) {
            i[j] = Integer.parseInt(input[j]);
        }
        
        if (i[2] + i[4] <= i[0]) {
            if (i[2] - i[4] >= 0) {
                if (i[3] + i[4] <= i[1]) {
                    if (i[3] - i[4] >= 0) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
```

This code segment implements the same logic as the Python code but uses Java's Scanner class for input handling, matches the syntax and type conventions of Java, and uses `System.out.println` for printing the output to the console.
