Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        String st = " ";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (char i : ip.toCharArray()) {
                if (Character.getNumericValue(i) > 4) {
                    int n = 9 - Character.getNumericValue(i);
                    st += String.valueOf(n);
                } else {
                    st += i;
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, checks if the length of the string is not 1, and if it is not, it checks if the first character is '9'. If it is, it sets the string `st` to '9' and removes the first character from the string `ip`. Then, it iterates over each character in `ip`, checks if the numeric value of the character is greater than 4, and if it is, it subtracts 4 from the numeric value and appends the result to `st`. If the numeric value of the character is not greater than 4, it appends the character to `st`. If the length of `ip` is 1, it sets `st` to `ip`. Finally, it converts `st` to an integer and prints it.
