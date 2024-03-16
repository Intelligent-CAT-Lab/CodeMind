Here's the Python code translated into Java. I've preserved the logic and structure of the original Python code as close to Java syntax as possible.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" â– ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        scanner.close();

        if (a != 0) {
            if (b % a != 0) {
                System.out.println("No â– solution");
            } else {
                b = b / a;
                int x = 0, y = -2000;
                if (b >= 0) {
                    while (y < b) {
                        y = (int) Math.pow(x, n);
                        x = x + 1;
                    }
                    if (y > b) {
                        System.out.println("No â– solution");
                    } else {
                        System.out.println(x - 1);
                    }
                } else {
                    if (n % 2 == 0) {
                        System.out.println("No â– solution");
                    } else {
                        x = -1;
                        y = 2000;
                        while (y > b) {
                            y = (int) Math.pow(x, n);
                            x = x - 1;
                        }
                        if (y < b) {
                            System.out.println("No â– solution");
                        } else {
                            System.out.println(x + 1);
                        }
                    }
                }
            }
        } else {
            if (b == 0) {
                System.out.println(5);
            } else {
                System.out.println("No â– solution");
            }
        }
    }
}
```

Please note that the input-splitting part uses a specific string “ â– ”. Make sure the input is split correctly based on the actual separator used. For instance, if the intended separator between numbers is a single space, you should update the `split` method's argument to `" "`.
