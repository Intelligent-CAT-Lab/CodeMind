Here is the translated Java code that performs the same task as the provided Python code:

```java
import java.util.Scanner;

public class NextPrime {

    public static boolean check(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        for (int i = a; i < 100500; i++) {
            if (check(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
```

This Java code should be run on a Java-enabled environment (like a terminal with `javac` and `java` commands or an Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA). When you run the code, it will ask for input and then outputs the smallest prime number after the number you provided, following the logic of the original Python code.
