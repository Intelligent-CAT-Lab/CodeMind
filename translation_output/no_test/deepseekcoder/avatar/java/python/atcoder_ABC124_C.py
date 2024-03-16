<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans1 = 0;
        int ans2 = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (i % 2 == 0) {
                if (c == '0') {
                    ans1++;
                } else {
                    ans2++;
                }
            } else {
                if (c == '1') {
                    ans1++;
                } else {
                    ans2++;
                }
            }
        }
        
        System.out.println(Math.min(ans1, ans2));
    }
}
```

### Response:
```python
import sys

def main():
    s = sys.stdin.readline().rstrip()
    ans1 = 0
    ans2 = 0

    for i, c in enumerate(s):
        c = int(c)
        
        if i % 2 == 0:
            if c == 0:
                ans1 += 1
            else:
                ans2 += 1
        else:
            if c == 1:
                ans1 += 1
            else:
                ans2 += 1

    print(min(ans1, ans2))

if __name__ == "__main__":
    main()
```
<|EOT|>
