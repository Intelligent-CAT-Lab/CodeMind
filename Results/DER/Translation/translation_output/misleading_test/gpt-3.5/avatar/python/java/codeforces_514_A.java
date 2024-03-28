```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine().trim();
        String st = "";

        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }

            for (int i = 0; i < ip.length(); i++) {
                char digit = ip.charAt(i);
                if (Character.getNumericValue(digit) > 4) {
                    int n = 9 - Character.getNumericValue(digit);
                    st += String.valueOf(n);
                } else {
                    st += String.valueOf(digit);
                }
            }
        } else {
            st = ip;
        }

        System.out.println(Integer.parseInt(st));
    }
}
```
