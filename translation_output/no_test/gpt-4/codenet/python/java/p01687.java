Below is the translation of the Python code into Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[] ref = "AADINNUY".toCharArray();
        String aizu = "AIZUNYAN";
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8) {
                    char[] part = inp.substring(i, i + 8).toCharArray();
                    Arrays.sort(part);
                    if (Arrays.equals(part, ref)) {
                        ans.append(aizu);
                        i += 8;
                        continue;
                    }
                }
                ans.append(inp.charAt(i));
                i++;
            }
            System.out.println(ans.toString());
        }

        scanner.close();
    }
}
```
This Java code uses `Scanner` for input, `Arrays.sort()` to sort a section of the array, and `StringBuilder` to efficiently build the answer string. The `sorted` behavior from Python is accomplished by creating a new array slice, sorting it, and then comparing it to the reference array. Note that the `continue` is used to skip to the next iteration of the `while` loop after appending `aizu`.
