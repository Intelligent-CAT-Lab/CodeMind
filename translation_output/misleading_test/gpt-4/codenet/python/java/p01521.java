Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        System.out.println((firstChar == 'x' && lastChar == 'x') ? 'x' : 'o');
    }
}
```

You can test this code with the provided test input `oxxoxoo` and it should give you the expected output `*`. Note that the expected output mentioned is `*`, but the conditions in the provided Python code will result in printing 'x' or 'o' depending on the input. Please make sure that the expected output should match the condition defined in the code.
