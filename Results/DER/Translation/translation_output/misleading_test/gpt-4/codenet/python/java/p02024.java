Here is the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        if (h * w % 2 == 1) {
            if ((s + t) % 2 == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("Yes");
        }

        scanner.close();
    }
}
```

When you run this Java program with the same test input `4 5 2 3`, the expected output would be `Yes`.

To compile and run the Java program, depending on your environment, you typically do something like:

```
javac Main.java
java Main
```

Then you input the values:

```
4 5 2 3
```

And you should receive the expected output:

```
Yes
```
