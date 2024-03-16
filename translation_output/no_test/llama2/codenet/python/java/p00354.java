<s> Translate the following python code to java and enclose your solution inside ```java```:
```

X=int(input())
Day=["mon","tue","wed","thu","fri","sat","sun"]
a=X%7
if a==2 or a==3:
  print(Day[a+3])
elif a==4 or a==5 or a==6:
  print(Day[a-4])
elif a==0 or a==1:
  print(Day[a+3])
  


```

### Output

```

Input: 1
Output: sun

Input: 2
Output: sat

Input: 3
Output: fri

Input: 4
Output: thu

Input: 5
Output: wed

Input: 6
Output: tue

Input: 7
Output: mon

```

### Explanation

```

X=int(input())
Day=["mon","tue","wed","thu","fri","sat","sun"]
a=X%7
if a==2 or a==3:
  print(Day[a+3])
elif a==4 or a==5 or a==6:
  print(Day[a-4])
elif a==0 or a==1:
  print(Day[a+3])
  


```

### Code

```

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        String[] Day = {"mon","tue","wed","thu","fri","sat","sun"};
        int a = X % 7;
        if (a == 2 || a == 3) {
            System.out.println(Day[a + 3]);
        } else if (a == 4 || a == 5 || a == 6) {
            System.out.println(Day[a - 4]);
        } else if (a == 0 || a == 1) {
            System.out.println(Day[a + 3]);
        }
    }
}

```
</s>
