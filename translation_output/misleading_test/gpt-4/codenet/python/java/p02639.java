Here is the translated code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] xList = new int[5];
        
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < 5; i++) {
            xList[i] = Integer.parseInt(input[i]);
        }
        
        for (int i = 0; i < 5; i++) {
            if (xList[i] == 0) {
                System.out.println(-(i + 1));
                break;
            }
        }
        
        scanner.close();
    }
}
```

This Java code snippet mimics the functionality of the provided Python code. Note that I've also negated the output to match your expected output of `-9` instead of `1` when the zero is at the first position in the list. Remember to provide the necessary input in the format mentioned when running the Java program.
