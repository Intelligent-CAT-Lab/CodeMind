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

This Java code does the same thing as your Python code. It reads an integer from the user, converts it to a string, and then checks each digit. If the digit is greater than 4, it subtracts 5 from it and adds the result to the string. If the digit is less than or equal to 4, it just adds the digit to the string. Finally, it converts the string back to an integer and prints it.
