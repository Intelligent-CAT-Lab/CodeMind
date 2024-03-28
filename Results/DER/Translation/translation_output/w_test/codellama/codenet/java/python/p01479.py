<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
eggchickenegg

Expected output:
egg


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
[/INST]

Here is the Python code that translates the Java code:
```python
import re

def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = re.sub(r"ee", "e e", line).replace("cc", "c c")
    strs = line.split(" ")
    max = 0
    ans = ""
    for s in strs:
        if max < len(s):
            max = len(s)
            ans = "egg" if s[-1] == "e" else "chicken"
    print(ans)

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `re` module to perform regular expression replacements, which is similar to the `replace` method in Java. The `split` method in Python is used to split the input string into a list of words, and the `len` function is used to get the length of each word. The `if` statement in the Python code is similar to the `if` statement in the Java code, but it uses the `len` function to check the length of the current word and the `ans` variable to store the result.</s>
