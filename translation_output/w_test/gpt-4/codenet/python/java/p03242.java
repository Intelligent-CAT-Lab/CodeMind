Below is the translation of the given Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < moji.length(); i++) {
            ans.append(moji.charAt(i) == '1' ? '9' : '1');
        }

        System.out.println(ans.toString());
    }
}
```

When you run this Java program with the test input `119`, it will output `991` as expected.
