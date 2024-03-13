<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    try:
        input_string = list(sys.stdin.readline().strip())
        remove_duplication = set(input_string)

        ans = "no"
        if len(input_string) == len(remove_duplication):
            ans = "yes"

        print(ans)
    except Exception as e:
        print(e)
        sys.exit(0)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input, splits it into a list of characters, and then checks if there are any duplicates by converting the list to a set. If the lengths of the list and the set are the same, it means there were no duplicates, so it prints "yes". Otherwise, it prints "no". If any exception occurs, it prints the exception and exits the program.<｜end▁of▁sentence｜>
