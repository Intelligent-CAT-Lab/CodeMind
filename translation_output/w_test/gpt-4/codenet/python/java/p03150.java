Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class KeyOfScience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        if(checkForKeyence(S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean checkForKeyence(String S) {
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                if ((S.substring(0, i) + S.substring(j)).equals("keyence")) {
                    return true;
                }
            }
        }
        for (int i = 0; i < S.length(); i++) {
            if (i + 8 <= S.length() && S.substring(i, i + 8).equals("keyence")) {
                return true;
            }
        }
        return false;
    }
}
```

The converted Java code contains a `KeyOfScience` class with a `main` method to take input from the user. It calls the `checkForKeyence` method to check if the input string can match "keyence" by the specified rules. The logic inside `checkForKeyence` is equivalent to the logic of the provided Python code. Please note that Java doesn't have a built-in `exit` function like Python, and we return a boolean value from the `checkForKeyence` method when we find a match, which will then be used to determine whether to print "YES" or "NO".
