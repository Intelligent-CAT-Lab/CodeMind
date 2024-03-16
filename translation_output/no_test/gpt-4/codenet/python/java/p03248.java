Here is the translated Java code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        
        if (s.charAt(s.length() - 1) == '1' || s.charAt(0) == '0') {
            System.out.println(-1);
            System.exit(0);
        }

        for (int i = 0; i < (s.length() - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                System.exit(0);
            }
        }

        String sd = s.substring(0, s.length() - 1) + '1';
        List<Integer> plist = new ArrayList<>();
        for (int i = 0; i < sd.length(); i++) {
            if (sd.charAt(i) == '1') {
                plist.add(i);
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int r = Collections.binarySearch(plist, i);
            if (r < 0) {
                r = -(r + 1); // If element is not found, binarySearch returns (-(insertion point) - 1)
            }
            System.out.println((i + 1) + " " + (plist.get(r) + 1));
        }
    }
}
```

Make sure to use `System` for input and output when translating Python code to Java. Also, note that Java's `binarySearch` method returns a negative value when the element is not found, representing the insertion point, so I've adjusted for that in the translated code.
