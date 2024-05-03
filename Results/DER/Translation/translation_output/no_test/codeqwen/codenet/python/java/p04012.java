Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        for (int i = 0; i < Alfa.length(); i++) {
            if (countOccurrences(w, Alfa.charAt(i)) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    private static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then checks each letter in the string to see if it appears an odd number of times. If it does, it prints "No" and exits the program. If it doesn't find any letters that appear an odd number of times, it prints "Yes".
