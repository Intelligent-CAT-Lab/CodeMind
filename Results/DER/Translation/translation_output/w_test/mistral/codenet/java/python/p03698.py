<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
inputString = input().split()
removeDuplication = set(inputString)
ans = "no"
if len(inputString) == len(removeDuplication):
    ans = "yes"
print(ans)
```</s>
