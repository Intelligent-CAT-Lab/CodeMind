<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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
                ans = strs[i].charAt(max - 1) == 'e' ? "egg" : "chicken";
            }
        }
        System.out.println(ans);
    }
}
```

@@ Response
```python
def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = line.replace("ee", "e e").replace("ee", "e e")
    .replace("cc", "c c").replace("cc", "c c")
    strs = line.split(" ")
    max = 0
    ans = ""
    for i in strs:
        if max < len(i):
            max = len(i)
            ans = "egg" if i[-1] == 'e' else "chicken"
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, replaces "egg" with "e" and "chicken" with "c", then splits the line into words. It then finds the longest word and checks if the last character of the word is 'e'. If it is, it sets the answer to "egg", otherwise it sets the answer to "chicken". Finally, it prints the answer.<｜end▁of▁sentence｜>
