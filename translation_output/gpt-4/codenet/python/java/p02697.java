Below is the equivalent Java code with the same functionality as the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int a = 1;
        int b = N / 2;
        int c = (N / 2) + 1;
        int d = N;
        if (N % 2 == 0) {
            a++;
        }

        int i = 0;
        while(i < M) {
            if (i < M) {
                System.out.println(c + " " + d);
                i++;
                c++;
                d--;
            } else {
                break;
            }
            if (i < M) {
                System.out.println(a + " " + b);
                a++;
                b--;
                i++;
            } else {
                break;
            }
        }

        scanner.close();
    }
}
```

Please note that in Java, we always need to import necessary classes and define a class and a `main` method as an entry point for the program to start executing. In this case, we are using the `Scanner` class to read the input from standard input (`System.in`).

Also, keep in mind that Java uses different syntax and structures for loops and the way inputs are handled compared to Python. The `System.out.println` is used to print the output in Java.
