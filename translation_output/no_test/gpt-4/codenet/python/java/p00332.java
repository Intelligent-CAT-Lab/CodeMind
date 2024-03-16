Here's the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        int Y = scanner.nextInt();
        
        if (E == 0) {
            if (1912 > Y) {
                System.out.println("M" + (Y - 1867));
            } else if (1926 > Y) {
                System.out.println("T" + (Y - 1911));
            } else if (1989 > Y) {
                System.out.println("S" + (Y - 1925));
            } else {
                System.out.println("H" + (Y - 1988));
            }
        } else if (E == 1) {
            System.out.println(1867 + Y);
        } else if (E == 2) {
            System.out.println(1911 + Y);
        } else if (E == 3) {
            System.out.println(1925 + Y);
        } else {
            System.out.println(1988 + Y);
        }

        scanner.close();
    }
}
```

Please ensure that this code is placed within a file named `Main.java`, as the public class in Java must match the file name. Additionally, if you are compiling and running from the command line, make sure to execute the `javac Main.java` command to compile and `java Main` to run the program.
