<s> Translate the following python code to java and enclose your solution inside ```java```:
```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```

### Solution

```java
public class Solution {
    public static void main(String[] args) {
        String C = "a";
        char[] al = new char[26];
        for (int idx = 97; idx < 123; idx++) {
            al[idx - 97] = (char) idx;
        }
        int idx = al.indexOf(C);
        System.out.println(al[idx + 1]);
    }
}
```
</s>
