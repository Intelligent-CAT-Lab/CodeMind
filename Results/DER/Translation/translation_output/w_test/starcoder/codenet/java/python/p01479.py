<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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
                ans = strs[i].charAt(max - 1) == 'e'? "egg" : "chicken";
            }
        }
        System.out.println(ans);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    line = sys.stdin.readline().replace("egg", "e").replace("chicken", "c")
    line = line.replace("ee", "e e").replace("ee", "e e")
    line = line.replace("cc", "c c").replace("cc", "c c")
    strs = line.split(" ")
    max = 0
    ans = ""
    for i in range(len(strs)):
        if max < len(strs[i]):
            max = len(strs[i])
            ans = strs[i][max - 1] == 'e'? "egg" : "chicken"
    print(ans)

if __name__ == "__main__":
    main()
```
<|endoftext|>
