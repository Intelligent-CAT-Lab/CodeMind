Here is the Java translation of the given Python code, along with the enclosing ```java``` as requested:

```java
import java.util.Scanner;

public class CheckNumberNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = scanner.nextLine();

        if (input.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
```

You would save this code in a file named `CheckNumberNine.java`. To run the code, compile it with `javac CheckNumberNine.java` and then run it with `java CheckNumberNine`. When prompted, enter the test input (in this case, "29") and you should see the expected output "Yes".
