System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import re

line = input().replace("egg", "e").replace("chicken", "c")
line = re.sub(r"ee", "e e", line)
line = re.sub(r"cc", "c c", line)
strs = line.split()
max_len = max(len(s) for s in strs)
max_count = max(strs.count(s) for s in strs if len(s) == max_len)
ans = "egg" if max_count > len(strs) // 2 else "chicken"
print(ans)
```<|endoftext|>
