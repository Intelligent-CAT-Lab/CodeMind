<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
                ans = strs[i].charAt(max - 1) == 'e' ? "egg" : "chicken";
            }
        }
        System.out.println(ans);
    }
}
```

### Response:
```python
import re

def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = re.sub(r'(.)\1', r'\1 \1', line)
    strs = line.split(" ")
    max_len = 0
    ans = ""
    for word in strs:
        if max_len < len(word):
            max_len = len(word)
            ans = "egg" if word[-1] == 'e' else "chicken"
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, replaces "egg" with "e" and "chicken" with "c", and then splits the line into words. It then finds the longest word and determines whether it ends with an "e" or a "c", printing "egg" or "chicken" accordingly.
<|EOT|>
