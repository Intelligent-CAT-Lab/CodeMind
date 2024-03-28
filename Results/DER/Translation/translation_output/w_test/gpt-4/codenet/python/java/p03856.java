Here is the equivalent Java code to perform the same function as the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};

        int[] numlist = new int[6];
        for (int i = 0; i < a.length; i++) {
            numlist[i] = countOccurrences(S, a[i]);
        }
        numlist[0] -= numlist[1];
        numlist[2] -= numlist[3];
        numlist[4] -= numlist[5];
        numlist[1] -= (numlist[4] + numlist[5]);          // Adjust dreamer count
        numlist[0] += (numlist[4] + numlist[5]);          // Adjust dream count
        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        if (total == S.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int countOccurrences(String haystack, String needle) {
        return (haystack.length() - haystack.replace(needle, "").length()) / needle.length();
    }
}
```

To run this Java code, you need to have the `Main` class and use the `Scanner` class for user input. In this code, the `countOccurrences` method counts occurrences of a specific substring within a string by replacing all instances with an empty string and calculating the difference in length, then dividing by the length of the substring to get the actual count of occurrences.
