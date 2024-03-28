<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
uncopyrightable

Expected output:
yes


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class p03698 {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            List<String> inputString = Arrays.asList(br.readLine().split(""));
            Set<String> removeDuplication = new HashSet<>();
            for (String str : inputString) {
                removeDuplication.add(str);
            }

            String ans = "no";
            if (inputString.size() == removeDuplication.size()) {
                ans = "yes";
            }

            System.out.println(ans);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
```

@@ Response
```python
def check_uniqueness(input_string):
    remove_duplication = set(input_string)
    if len(input_string) == len(remove_duplication):
        return "yes"
    else:
        return "no"

try:
    input_string = input()
    print(check_uniqueness(input_string))
except Exception as e:
    print(e)
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if all characters in the string are unique, and prints "yes" if they are and "no" if they are not.<｜end▁of▁sentence｜>
