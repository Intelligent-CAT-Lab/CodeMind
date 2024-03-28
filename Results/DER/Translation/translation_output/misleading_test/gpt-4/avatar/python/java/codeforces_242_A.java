Here's the equivalent Java code for the provided Python code. The Python list comprehension is translated to nested loops in Java to iterate over the range of values. The condition `i > j` is preserved, and a 2D ArrayList is used to store the pairs before printing them.

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        ArrayList<int[]> c = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    c.add(new int[]{i, j});
                }
            }
        }
        
        System.out.println(c.size());
        for (int[] pair : c) {
            System.out.println(pair[0] + " " + pair[1]);
        }

        scanner.close();
    }
}
```
Before running this code, you need to ensure that Java is properly installed on your system and that you have a suitable environment to compile and execute Java applications. Save the code in a file named `Main.java`, compile it with `javac Main.java`, and then run it with `java Main`. Enter the provided test input to see the expected output.
