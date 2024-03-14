Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
                ans = strs[i].charAt(max - 1) == 'e'? "egg" : "chicken";
            }
        }
        System.out.println(ans);
    }
}
```

### Response:
```python
import java.util.Arrays
import java.util.Scanner

class p01479:
    MAX = 1000000

    def main(self):
        sc = Scanner(System.in)

        line = sc.next().replace("egg", "e").replace("chicken", "c")
        line = line.replace("ee", "e e").replace("ee", "e e")\
               .replace("cc", "c c").replace("cc", "c c")
        strs = line.split(" ")
        max = 0
        ans = ""
        for i in range(len(strs)):
            if max < len(strs[i]):
                max = len(strs[i])
                ans = "egg" if strs[i][max-1] == 'e' else "chicken"
        print(ans)

p01479().main()
```<|endoftext|>
