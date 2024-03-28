Below is the translated Java code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        if (s.endsWith("1") || s.startsWith("0")) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < (s.length() - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                return;
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
            int r = bisect(plist, i);
            System.out.println((i + 1) + " " + (plist.get(r) + 1));
        }
    }

    private static int bisect(List<Integer> plist, int i) {
        int left = 0, right = plist.size(), mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (plist.get(mid) <= i) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
```

Java doesn’t have a direct equivalent of Python's `bisect` library. Therefore, I've written a custom `bisect` method that performs the same operation as `bisect.bisect` in Python, which is equivalent to finding the insertion point for `i` in a sorted list to maintain the order.

Make sure you have the `java.util.Scanner` and `java.util.*` imports to properly implement the user input and the use of the `ArrayList` class.
