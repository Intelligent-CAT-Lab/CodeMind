<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import re

MAX = 1000000

def main():
    sc = input()
    line = sc.strip().replace("egg", "e").replace("chicken", "c")
    line = re.sub(r"ee", "e e", line)
    line = re.sub(r"cc", "c c", line)
    strs = line.split()
    max = 0
    ans = ""
    for i in range(len(strs)):
        if len(strs[i]) > max:
            max = len(strs[i])
            ans = "egg" if strs[i][-1] == "e" else "chicken"
    print(ans)

if __name__ == "__main__":
    main()
```</s>
