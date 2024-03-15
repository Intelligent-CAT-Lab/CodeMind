<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
if (s[0]==s[-1] and len(s)%2==0) or (s[0]!=s[-1] and len(s)%2==1):
 print("First")
else:
 print("Second")
```

### Input

```
First
```

### Output

```
First
```

### Explanation

```
First
```

### Code

```java
public class Solution {
    public static void main(String[] args) {
        String s = "First";
        if (s[0]==s[-1] && len(s)%2==0) or (s[0]!=s[-1] and len(s)%2==1):
            System.out.println("First");
        else:
            System.out.println("Second");
    }
}
```
</s>
