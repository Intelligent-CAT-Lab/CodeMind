<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import re

def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = re.sub(r"ee", "e e", line).replace("cc", "c c")
    strs = line.split(" ")
    max_length = 0
    ans = ""
    for s in strs:
        if len(s) > max_length:
            max_length = len(s)
            ans = "egg" if s[-1] == "e" else "chicken"
    print(ans)

if __name__ == "__main__":
    main()
```
This is the Python code that translates the Java code you provided. It uses the `re` module to perform the regular expression replacements, and the `split()` method to split the input string into a list of words. The rest of the code is similar to the Java code, with the exception of the `if` statement that checks the length of the current word and updates the `ans` variable accordingly.</s>
