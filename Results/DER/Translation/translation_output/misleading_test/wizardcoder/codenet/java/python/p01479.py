Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
eggchickenegg

Expected output:
egzg

```
import java.util.Arrays;
import java.util.Scanner;

public class p01479 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String line = sc.next().replace("egg", "e").replace("chicken", "c");
        line = line.replace("ee", "e e").replace("ee", "e e")
               .replace("cc", "c c").replace("cc", "c c");
        String strs[] = line.split(" ");
        int max = 0;
        String ans = "";
        for (int i = 0; i < strs.length; i++) {
            if (max < strs[i].length()) {
                max = strs[i].length();
                ans = strs[i].charAt(max - 1) == 'e'? "egg" : "chicken";
            }
        }
        System.out.println(ans);
    }
}
```

### Response:
```python
import re

def translate(line):
    line = re.sub(r'egg', 'e', line)
    line = re.sub(r'chicken', 'c', line)
    line = re.sub(r'ee', 'e e', line)
    line = re.sub(r'cc', 'c c', line)
    strs = line.split()
    max_len = 0
    ans = ''
    for s in strs:
        if len(s) > max_len:
            max_len = len(s)
            ans = 'egg' if s[-1] == 'e' else 'chicken'
    return ans

line = input().strip()
print(translate(line))
```

Explanation:

- We first import the `re` module for regular expressions.
- We define a function `translate` that takes a string `line` as input.
- We use the `re.sub` method to replace all occurrences of "egg" with "e" and all occurrences of "chicken" with "c".
- We then use `re.sub` again to replace all occurrences of "ee" with "e e" and all occurrences of "cc" with "c c".
- We split the resulting string into a list of words using the `split` method.
- We initialize `max_len` to 0 and `ans` to an empty string.
- We loop through each word in the list and check if its length is greater than `max_len`. If it is, we update `max_len` and `ans` accordingly.
- Finally, we return `ans`.
- In the `main` method, we read the input string using the `input` function and strip any leading or trailing whitespace using the `strip` method.
- We then call the `translate` function with the input string as argument and print the result using the `print` function.<|endoftext|>
