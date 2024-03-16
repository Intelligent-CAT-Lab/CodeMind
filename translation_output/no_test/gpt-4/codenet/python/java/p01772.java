Certainly! Below is an equivalent Java program for the given Python code. Java requires more verbose syntax, including explicit declaration of variable types. Also, Java uses a `Scanner` object to get user input and a `StringBuilder` for efficient string concatenation:

```java
import java.util.Scanner;

public class AZPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        StringBuilder ans = new StringBuilder();
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' && !flag) {
                flag = true;
            }
            if (c == 'Z' && flag) {
                ans.append("AZ");
                flag = false;
            }
        }

        if (ans.toString().equals("")) {
            System.out.println(-1);
        } else {
            System.out.println(ans.toString());
        }

        scanner.close();
    }
}
```

Remember to include the appropriate import statement for `Scanner` at the beginning of the file. This Java program takes a string input from the user, processes it to find "AZ" pairs according to the logic in the original Python code, and output the result to the console.
