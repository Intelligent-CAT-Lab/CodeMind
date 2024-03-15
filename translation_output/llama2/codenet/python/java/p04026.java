<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
for i in range(len(s)-1):
    if s[i]==s[i+1]:
        print(i+1,i+2)
        exit()
for i in range(len(s)-2):
    if s[i]==s[i+2]:
        print(i+1,i+3)
        exit()
print(-1,-1)
```

### Input

The first line of input contains a string `s`.

### Output

Print the indices of the first and second occurrence of the same character in `s`.

### Constraints

1 <= `s` <= 1000

### Example Input

```
abc
```

### Example Output

```
0 1
```

### Explanation

The first occurrence of `a` is at index 0 and the second occurrence is at index 1.

### Hint

Use a for loop to iterate over the string.

### Solution

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        for(int i=0;i<len-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                System.out.println(i+1);
                System.out.println(i+2);
                break;
            }
        }
        for(int i=0;i<len-2;i++)
        {
            if(s.charAt(i)==s.charAt(i+2))
            {
                System.out.println(i+1);
                System.out.println(i+3);
                break;
            }
        }
        System.out.println(-1);
        System.out.println(-1);
    }
}
```
</s>
