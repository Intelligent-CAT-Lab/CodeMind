Here is the Java version of your Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        String inp = "AIDUNYAN";
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && Arrays.equals(Arrays.stream(inp.substring(i, i + 8).split("")).sorted().toArray(), Arrays.stream(ref.split("")).sorted().toArray())) {
                    ans.append(aizu);
                    i += 8;
                } else {
                    ans.append(inp.charAt(i));
                    i += 1;
                }
            }
            System.out.println(ans.toString());
        }
    }
}
```

This Java code does the same thing as your Python code. It checks if the length of the input string is less than 8, if so, it prints the input string. If the length is 8 or more, it checks if the substring of the input string from index i to i+8 is sorted the same as the reference string. If it is, it appends the aizu string to the answer string and increments i by 8. If it isn't, it appends the character at index i to the answer string and increments i by 1. Finally, it prints the answer string.
