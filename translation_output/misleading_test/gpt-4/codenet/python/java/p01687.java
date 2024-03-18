Below is the Python code translated into Java, including the main method for test input and expected output. Please note that in Java, we use `Scanner` to receive input and `System.out.println()` to print output to the console. Also, in Java, we use a `char[]` array to manipulate string characters, as strings are immutable in Java.

```java
import java.util.Arrays;
import java.util.Scanner;

public class AizuTransform {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = transform(input);
        System.out.println(result);
        scanner.close();
    }

    private static String transform(String input) {
        char[] ref = new char[]{'A', 'A', 'D', 'I', 'N', 'N', 'U', 'Y'};
        String aizu = "AIZUNYAN";
        
        if (input.length() < 8) {
            return input;
        } else {
            StringBuilder ans = new StringBuilder();
            int i = 0;
            while (i < input.length()) {
                if (i <= input.length() - 8) {
                    char[] subArray = input.substring(i, i + 8).toCharArray();
                    Arrays.sort(subArray);
                    if (Arrays.equals(subArray, ref)) {
                        ans.append(aizu);
                        i += 8;
                        continue;
                    }
                }
                ans.append(input.charAt(i));
                i++;
            }
            return ans.toString();
        }
    }
}
```

To test the above Java code with the provided test input "AIDUNYAN", you can simply input this string when the program prompts you, and it should print "AI)UqYAR" as the expected output. Please remember that the Java environment needs to be properly set up with JDK to compile and run Java code.
