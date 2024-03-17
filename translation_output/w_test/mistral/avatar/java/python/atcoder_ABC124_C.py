<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
0


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
[/INST]
```python
# Sample test case
s = input()

# Initialize variables
ans1 = 0
ans2 = 0

# Iterate through each character in the string
for i in range(len(s)):
    # If the index is even, increment ans1 if the character is 0, otherwise increment ans2
    if i % 2 == 0:
        if s[i] == '0':
            ans1 += 1
        else:
            ans2 += 1
    # If the index is odd, increment ans1 if the character is 1, otherwise increment ans2
    else:
        if s[i] == '1':
            ans1 += 1
        else:
            ans2 += 1

# Print the minimum of ans1 and ans2
print(min(ans1, ans2))
```</s>
