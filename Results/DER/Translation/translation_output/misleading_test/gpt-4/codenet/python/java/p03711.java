Here's the translated Java code:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        Set<Integer> a = new HashSet<>();
        // Adding elements of 'a' month group
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(8);
        a.add(10);
        a.add(12);
        
        Set<Integer> b = new HashSet<>();
        // Adding elements of 'b' month group
        b.add(4);
        b.add(6);
        b.add(9);
        b.add(11);
        
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if ((a.contains(x) && a.contains(y)) || (b.contains(x) && b.contains(y))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

To use this code, you must have a Java environment set up to compile and execute it. When you compile and run this program, input the text "1 3" when the program is waiting for input and it should produce the expected output "Yes".

Here's how to compile and run the Java code (assuming you have the JDK installed and properly configured):

1. Save the code in a file named `Main.java`.
2. Open a terminal or command prompt and navigate to the directory where you saved `Main.java`.
3. Compile the code using `javac Main.java`.
4. Run the compiled code with the command `java Main`.
5. Input "1 3" when prompted.
6. Observe "Yes" as the output.
