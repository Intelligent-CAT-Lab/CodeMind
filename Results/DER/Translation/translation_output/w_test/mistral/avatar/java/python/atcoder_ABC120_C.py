<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
0


```
import java.util.Scanner;

public class atcoder_ABC120_C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.next().toCharArray();
        int ans = 0;
        int c1 = 0;
        int c0 = 0;
        
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == '1') {
                if (c0 > 0) {
                    c0--;
                    ans++;
                } else {
                    c1++;
                }
            } else {
                if (c1 > 0) {
                    c1--;
                    ans++;
                } else {
                    c0++;
                }
            }
        }
        
        System.out.println(ans * 2);
    }
}
```
[/INST]
```python
# Sample test case
s1 = input()

# Expected output
ans = 0

# Initialize counters
c1 = 0
c0 = 0

# Iterate through the string
for i in range(len(s1)):
    # If current character is '1', decrement c0 and increment ans
    if s1[i] == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    # If current character is '0', increment c1 and decrement ans
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

# Print the final answer
print(ans * 2)
```</s>
