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

            for (int i = 0; i < ip.length(); i++) {
                int currentDigit = Integer.parseInt(String.valueOf(ip.charAt(i)));
                if (currentDigit > 4) {
                    int n = 9 - currentDigit;
                    st += n;
                } else {
                    st += currentDigit;
                }
            }
        } else {
            st = ip;
        }

        System.out.println(Integer.parseInt(st.trim()));
    }
}
```
