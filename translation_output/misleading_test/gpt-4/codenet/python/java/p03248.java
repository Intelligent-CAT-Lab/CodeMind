Here's the Python code translated to Java:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
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
            int r = bisect(plist, i);
            System.out.println((i + 1) + " " + (plist.get(r) + 1));
        }
    }

    private static int bisect(List<Integer> plist, int i) {
        int left = 0;
        int right = plist.size();
        int idx = 0;
        while (left < right) {
            idx = (left + right) / 2;
            if (plist.get(idx) <= i) {
                left = idx + 1;
            } else {
                right = idx;
            }
        }
        return left;
    }
}
```

To perform the task, we have to convert several aspects of the code:

- Python's 'input()' function is replaced with Java's 'Scanner.nextLine()' to read input from the user.
- In Python, string slicing is possible, but in Java, we must use 'substring()' for similar operation.
- Python's 'print()' function is replaced with Java's 'System.out.println()' 
- Python's 'exit()' function is replaced with Java's 'System.exit(0)'
- There's no direct Python's 'bisect' function in Java. Instead, we implement our method 'private static int bisect()' to perform the binary search and find the insertion point.
- Python's lists are implemented using Java's 'ArrayList'.

Make sure you enter the input number as a sequence string, as expected by the program.
