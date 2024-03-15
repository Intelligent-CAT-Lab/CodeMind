Here is the equivalent Java code for the Python snippet you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine()); // Assuming there will be a valid integer input
        System.out.println(50);
        
        int a = K / 50, b = K % 50;
        int[] ans = new int[50];
        
        for (int i = 0; i < 50 - b; i++) {
            ans[i] = a + i;
        }
        
        for (int i = 0; i < b; i++) {
            ans[50 - b + i] = a + 50 - b + i + 1;
        }
        
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}
```
Please note that Java uses explicit typing and requires the declaration of the size of arrays ahead of time. The "input()" function from Python is replaced with a Scanner object in Java. Additionally, integer division in Java discards the fractional part without needing `//` as in Python; the single `/` operator suffices. In Java, array values are accessed and modified with brackets `[ ]`, unlike Python where you can directly append to a list. Lastly, the print statement needs to explicitly loop through the array elements to mimic Python's `join` method because Java does not have an equivalent built-in `join` function for arrays of integers.
