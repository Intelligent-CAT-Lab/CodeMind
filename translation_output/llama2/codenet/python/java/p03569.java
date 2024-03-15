<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
S = str(input())
i = 0
j = len(S) - 1
c = 0
while(True):
    if i >= j:
        break
    if (S[i] == S[j]):
        i += 1
        j -= 1
    else:
        if (S[i] == 'x'):
            i += 1
            c += 1
        elif (S[j] == 'x'):
            j -= 1
            c += 1
        else:
            print('-1')
            sys.exit()
print(c)
```

### Input

The first line of input contains a string S.

### Output

Print the number of occurrences of 'x' in S.

### Constraints

1 <= |S| <= 10^5

### Example Input

```
xxy
```

### Example Output

```
2
```

### Explanation

The string S is "xxy".

The first occurrence of 'x' is at index 1.

The second occurrence of 'x' is at index 2.

### Hint

Use a while loop to iterate through the string.

### Java

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = 0;
        int j = S.length() - 1;
        int c = 0;
        while (true) {
            if (i >= j) {
                break;
            }
            if (S.charAt(i) == S.charAt(j)) {
                i++;
                j--;
            } else {
                if (S.charAt(i) == 'x') {
                    i++;
                    c++;
                } else if (S.charAt(j) == 'x') {
                    j--;
                    c++;
                } else {
                    System.out.println("-1");
                    System.exit(0);
                }
            }
        }
        System.out.println(c);
    }
}
```
</s>
