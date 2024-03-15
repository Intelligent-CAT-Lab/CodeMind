<s> Translate the following python code to java and enclose your solution inside ```java```:
```
S=input()
if 'a' in S and 'b' in S and 'c' in S:
    print('Yes')
else:
    print('No')
```

### Solution

```java
String S = input();
if (S.contains("a") && S.contains("b") && S.contains("c")) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}
```
</s>
