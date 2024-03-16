Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if(a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }

        input.close();
    }
}
```

When you run this Java program with the input `5 5`, it will produce the expected output `5`.
