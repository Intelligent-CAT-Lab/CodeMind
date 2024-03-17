<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def is_uncopyrightable(input_string):
    remove_duplication = set(input_string)
    if len(input_string) == len(remove_duplication):
        return "yes"
    else:
        return "no"

input_string = input()
print(is_uncopyrightable(input_string))
```

This Python code reads a string from the standard input, removes duplicates by converting it to a set, and then compares the lengths of the original string and the set. If they are equal, it means all characters in the string are unique, so it returns "yes". Otherwise, it returns "no".
<|EOT|>
