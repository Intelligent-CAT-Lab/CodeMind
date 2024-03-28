Here is the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class DnaComplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();
        scanner.close();

        if (b.equals("A")) {
            System.out.println("T");
        } else if (b.equals("C")) {
            System.out.println("G");
        } else if (b.equals("G")) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }
    }
}
```

This Java code achieves the same functionality as your provided Python script. It takes an input from the user, checks for a matching DNA base and outputs its complement. Just like the Python code, it assumes that only one character will be inputted representing a DNA base.
