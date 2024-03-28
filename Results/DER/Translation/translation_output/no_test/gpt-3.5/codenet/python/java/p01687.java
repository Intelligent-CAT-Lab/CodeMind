```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] ref = "AADINNUY".toCharArray();
        String aizu = "AIZUNYAN";

        Scanner scanner = new Scanner(System.in);
        String inp = scanner.next();

        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && Arrays.equals(sortSubstring(inp, i, i + 8), ref)) {
                    ans.append(aizu);
                    i += 8;
                } else {
                    ans.append(inp.charAt(i));
                    i++;
                }
            }
            System.out.println(ans.toString());
        }
    }

    public static char[] sortSubstring(String str, int start, int end) {
        char[] sub = str.substring(start, end).toCharArray();
        Arrays.sort(sub);
        return sub;
    }
}
```

