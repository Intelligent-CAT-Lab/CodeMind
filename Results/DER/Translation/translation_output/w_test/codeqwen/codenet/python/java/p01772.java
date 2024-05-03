Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = "";
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c == 'A' && !flag) {
                flag = true;
            }
            if (c == 'Z' && flag) {
                ans += "AZ";
                flag = false;
            }
        }
        if (ans.equals("")) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If it encounters an 'A' and the flag is not set, it sets the flag to true. If it encounters a 'Z' and the flag is set, it appends "AZ" to the answer string and resets the flag to false. If the answer string is empty at the end, it prints -1, otherwise it prints the answer string.
