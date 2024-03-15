Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        scanner.close();
        
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < moji.length(); i++) {
            ans.append(moji.charAt(i) == '1' ? "9" : "1");
        }
        
        System.out.println(ans.toString());
    }
}
```

This Java code does the same as the Python code you provided. It uses a `StringBuilder` to build the `ans` string instead of concatenating strings, which is more efficient in Java.
