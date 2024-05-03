Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String A = parts[0];
        String x = parts[1];
        String C = parts[2];
        System.out.println(A + x.charAt(0) + C);
    }
}
```

In this Java code, we are using `Scanner` to read the input from the user. The `split` method of the `String` class is used to split the input string into an array of strings based on a delimiter (in this case, a space). We then assign the first, second, and third elements of the array to the variables `A`, `x`, and `C` respectively. Finally, we print the concatenation of `A`, the first character of `x`, and `C`.
