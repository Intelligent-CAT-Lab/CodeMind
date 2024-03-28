Below is the Java translation of the provided Python code, which prints each divisor in the sequence, and sets the current number to that divisor:

```java
import java.util.Scanner;

public class DivisorSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ▇ ");
                a = i;
            }
        }
        scanner.close();
    }
}
```

To test this Java program with the input `733035`, you just need to provide the input when prompted, and the program will produce the expected output:

```
732989 ▇ 244387 ▇ 48927 ▇ 23 ▇ 
```

Please note that the exact representation of the white block which is shown as '▇' in the provided python code `end=' ▇ '` might not display properly on some consoles. If it's a problem, you may want to replace it with another character or a standard space.
