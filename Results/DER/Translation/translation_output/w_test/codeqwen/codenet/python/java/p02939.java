Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int[] l = new int[S.length() + 1];
        l[1] = 1;
        if (S.charAt(0) == S.charAt(1)) {
            l[2] = 1;
        } else {
            l[2] = 2;
        }

        for (int i = 3; i < S.length() + 1; i++) {
            if (S.charAt(i - 1) != S.charAt(i - 2)) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = l[i - 3] + 2;
            }
        }

        System.out.println(l[S.length()]);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, creates an array `l` of the same length as the string, and then iterates over the string to fill in the array. Finally, it prints the last element of the array, which is the length of the longest subsequence of the string that alternates between characters.
