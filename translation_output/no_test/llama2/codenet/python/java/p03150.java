<s> Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
for i in range(len(S)):
    for j in range(i,len(S)+1):
        if S[:i]+S[j:] == "keyence":
            print("YES")
            exit()
for k in range(len(S)):
    if S[i::i+8] == "keyence":
        print("YES")
        exit()
print("NO")
```

### 解答

```java
String S = input();
for (int i = 0; i < S.length(); i++) {
    for (int j = i; j < S.length() + 1; j++) {
        if (S.substring(0, i) + S.substring(j) == "keyence") {
            System.out.println("YES");
            break;
        }
    }
}
for (int k = 0; k < S.length(); k++) {
    if (S.substring(k, k + 8) == "keyence") {
        System.out.println("YES");
        break;
    }
}
System.out.println("NO");
```
</s>
