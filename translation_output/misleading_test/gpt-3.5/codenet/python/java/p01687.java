```java
import java.util.Arrays;
import java.util.Scanner;
public class PythonToJava {
    public static void main(String[] args) {
        char[] ref = {'A', 'A', 'D', 'I', 'N', 'N', 'U', 'Y'};
        String aizu = "AIZUNYAN";

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() < 8) {
            System.out.println(input);
        } else {
            StringBuilder ans = new StringBuilder();
            int length = input.length();
            int i = 0;
            while (i < length) {
                if (i <= length - 8 && Arrays.equals(sortString(input.substring(i, i + 8)).toCharArray(), ref)) {
                    ans.append(aizu);
                    i += 8;
                } else {
                    ans.append(input.charAt(i));
                    i += 1;
                }
            }
            System.out.println(ans.toString());
        }
    }

    public static String sortString(String inputString) {
        char[] arr = inputString.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
```
```
