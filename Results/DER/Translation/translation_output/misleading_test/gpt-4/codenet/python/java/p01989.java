Below you will find the provided Python code translated into Java. I've made sure to recreate the same logic within a Java program. The methods `isValidPart` and `main` are used to handle the input and the core logic:

```java
import java.util.Scanner;

public class IPv4Counter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        int cnt = 0;

        for (int a = 1; a < N - 2; a++) {
            for (int b = a + 1; b < N - 1; b++) {
                for (int c = b + 1; c < N; c++) {
                    boolean ok = true;
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
                    String[] parts = {A, B, C, D};

                    for (String x : parts) {
                        if (!isValidPart(x)) {
                            ok = false;
                            break;
                        }
                    }

                    if (ok) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
        scanner.close();
    }

    private static boolean isValidPart(String part) {
        if (part.length() == 0 || part.length() > 3) return false;
        int num = Integer.parseInt(part);
        if ((part.charAt(0) == '0' && part.length() > 1) || num > 255) {
            return false;
        }
        return true;
    }
}
```

Remember, this code requires that the input is provided directly without expecting a prompt. When running this code, ensure the console input is provided (typically through typing or as a command line argument), and then the code will output the result.
