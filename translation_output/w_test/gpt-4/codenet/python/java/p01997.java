Certainly! Below is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import static java.lang.Math.PI;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble(); // Unused in the calculation
        double B = scanner.nextDouble();
        double volume = (4.0 / 3) * PI * Math.pow(B, 3);

        System.out.printf("%.10f%n", volume);
    }
}
```

The Java version reads from `System.in` and writes to `System.out` similar to Python's `input()` and `print()` functionalities. Note that the variable `A` is read in but not used, just as in the Python version.

Here is how you can use this Java program with the provided test case:

Test input:
```
1 2
```

Expected output:
```
33.510321638291124
```

To compile and run this Java program, you would save it to a file named `SphereVolume.java`, then compile with `javac SphereVolume.java` and run with `java SphereVolume`, providing the input `1 2` when prompted.
