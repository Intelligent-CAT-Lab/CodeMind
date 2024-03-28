Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt(); // Gets input

        int ans = attack(H);
        System.out.println(ans); // Prints the output
        scanner.close();
    }

    public static int attack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + attack(tairyoku / 2) * 2;
        }
    }
}
```

This Java code will read an integer from the standard input, which corresponds to your variable `H`, and then it will print the result of the `attack` method, which performs the same calculation as your original `atack` function in Python. Note that the method is renamed to `attack` as `atack` might have been a typo.
