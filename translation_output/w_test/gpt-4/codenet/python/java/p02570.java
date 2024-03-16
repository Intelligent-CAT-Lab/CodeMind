Certainly! Below is your Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data[] = new int[3];

        for (int i = 0; i < 3; i++) {
            data[i] = scanner.nextInt();
        }

        if ((data[0] / (double) data[1]) <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

When you run this Java code and input "1000 15 80", it should output "Yes", just like the Python code would.
