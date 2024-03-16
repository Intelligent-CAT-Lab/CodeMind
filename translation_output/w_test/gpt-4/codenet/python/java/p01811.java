Here is the translated Java code for the provided Python script:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABCReconstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        List<Character> log = new ArrayList<>();
        
        while (s.length() > 3 && f) {
            f = false;
            if (s.startsWith("ABC")) {
                s = s.replaceFirst("ABC", "A");
                log.add('A');
                f = true;
            } else if (s.endsWith("ABC")) {
                s = s.substring(0, s.length() - 3) + 'C';
                log.add('C');
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replaceFirst("ABC", "B");
                log.add('B');
                f = true;
            }
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            return;
        }
        int l = log.size();
        for (int i = 0; i < l; i++) {
            s = s.replace(log.get(l - 1 - i).toString(), "ABC");
        }
        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
```

To use the above Java code:

1. It reads the input from the standard input using a `Scanner`.
2. It performs the replacements and logging similar to the Python script.
3. It finally uses a loop to reconstruct the original string based on the log and checks against the initial input.
4. It prints "Yes" or "No" to the standard output.
