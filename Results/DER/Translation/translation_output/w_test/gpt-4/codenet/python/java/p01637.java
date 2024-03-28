Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Calculation {
    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt();
        int rd = scanner.nextInt();
        int rr = scanner.nextInt();
        int cd = scanner.nextInt();
        int cr = scanner.nextInt();
        
        int ex = cd * 100 / rd;
        if(f(ex, rd, cd)) ex++;
        int ey = cr * 100 / rr;
        if(f(ey, rr, cr)) ey++;
        
        System.out.println(m - ex - ey >= 0 ? m - ex - ey : -1);
        
        scanner.close();
    }
}
```

You can compile and run this Java class by saving it to a file named `Calculation.java` and then use a command-line interface to execute the following commands:

```sh
javac Calculation.java
java Calculation
```

Once you run the program, it will wait for the input as described in the test case. Enter the values separated by space like `M rd rr cd cr`, and it will provide the expected output based on the logic translated from the Python code.
