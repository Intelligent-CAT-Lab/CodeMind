Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        System.out.println(Integer.parseInt(s[0]) - Integer.parseInt(s[1]));
    }
}
```

In this Java code, we use `Scanner` to read the input from the user. The `split` method is used to split the input string into an array of strings based on the space character. Then, we use `Integer.parseInt` to convert the strings in the array to integers and subtract the second integer from the first. The result is then printed to the console.
