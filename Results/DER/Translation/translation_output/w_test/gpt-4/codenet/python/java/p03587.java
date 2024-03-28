Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(countOccurrences(s, '1'));
    }

    public static int countOccurrences(String str, char charToCount) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charToCount) {
                count++;
            }
        }
        return count;
    }
}
```

To compile and run this Java program, save it to a file named `Main.java`, and use the following commands:

```shell
javac Main.java
java Main
```

When prompted, input `111100` (or whatever string you want to test), and the program will output the number of times the character '1' appears in the string, which would be `4` for the provided test case.
