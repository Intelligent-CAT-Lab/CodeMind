<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
print(len(s)//2-s.count('p'))
```

### Explanation

```
s=input()
```

This line takes input from the user and stores it in the variable s.

```
print(len(s)//2-s.count('p'))
```

This line calculates the number of 'p' characters in the string s and subtracts it from the length of the string divided by 2.

### Hint

Use the `String` class to manipulate the input string.

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') {
                count++;
            }
        }
        System.out.println(s.length()/2 - count);
    }
}
```
</s>
