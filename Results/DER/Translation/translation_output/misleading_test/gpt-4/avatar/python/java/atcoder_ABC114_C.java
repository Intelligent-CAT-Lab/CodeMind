Here is the equivalent Java code for the provided Python program:

```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(aaa("0"));
        scanner.close();
    }

    private static int aaa(String n) {
        int num = Integer.parseInt(n);
        if (num > N) {
            return 0;
        }

        Set<Character> numSet = new HashSet<>();
        for (char c : n.toCharArray()) {
            numSet.add(c);
        }
        Set<Character> validSet = new HashSet<>();
        validSet.add('3');
        validSet.add('5');
        validSet.add('7');
        int ans = numSet.equals(validSet) ? 1 : 0;

        for (char i : new char[] {'7', '5', '3'}) {
            ans += aaa(n + i);
        }
        return ans;
    }
}
```

This Java program reads an integer from the console, determines if the number is exclusively composed of characters '7', '5', and '3', then recursively builds numbers by appending these characters, and finally prints the count of numbers that meet the criteria up to the integer provided.

To test the case provided (with input `333333357`), simply run the Java code and input the test value when prompted, and it should output the expected result (`8307`).
