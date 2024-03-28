<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def is_uncopyrightable(input_string):
    unique_chars = set(input_string)
    return "yes" if len(input_string) == len(unique_chars) else "no"

if __name__ == "__main__":
    input_string = sys.stdin.readline().strip()
    print(is_uncopyrightable(input_string))
```
This code reads a string from standard input, splits it into a list of characters, and then checks if the list contains any duplicates. If the list contains no duplicates, it returns "yes", otherwise it returns "no".

The `set()` function is used to create a set of unique characters from the input string. If the length of the set is the same as the length of the input string, it means that there are no duplicates, and the string is uncopyrightable.

The `strip()` method is used to remove any leading or trailing whitespace from the input string.

The `print()` function is used to print the result to the console.

The `if __name__ == "__main__":` block is used to indicate that the code should only be executed if it is run as a script, rather than being imported as a module.</s>
