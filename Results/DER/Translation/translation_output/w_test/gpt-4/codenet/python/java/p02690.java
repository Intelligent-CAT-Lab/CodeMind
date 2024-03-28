Here's the equivalent Java code for the Python sample you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean found = false;
        
        for (int i = -1000; i < 1000 && !found; i++) {
            for (int j = -1000; j < 1000; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == x) {
                    System.out.println(i + " " + j);
                    found = true;
                    break;
                }
            }
        }
        
        scanner.close();
    }
}
```
This script should be compiled and run in a Java environment owing to its entry point through the `main` method. It reads an integer from the user, similar to the Python script, and then iterates through the possible values for `i` and `j` looking for a solution to the equation `i^5 - j^5 = x`. Once it finds a solution, it prints out the values of `i` and `j` and stops checking further.
