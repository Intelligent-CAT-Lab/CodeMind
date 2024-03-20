Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
54

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
import java.util.*;

class atcoder_ABC124_C:
    def main(self):
        sc = Scanner(System.in)
        s = sc.nextLine()
        ans1 = 0
        ans2 = 0
        
        for i in range(s.length()):
            c = s.charAt(i)
            
            if i % 2 == 0:
                if c == '0':
                    ans1 += 1
                else:
                    ans2 += 1
            else:
                if c == '1':
                    ans1 += 1
                else:
                    ans2 += 1
        
        System.out.println(min(ans1, ans2))
```<|endoftext|>
