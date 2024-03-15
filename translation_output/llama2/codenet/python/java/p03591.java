<s> Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
print('Yes' if S[:4] == 'YAKI' else 'No')
```

### Hint

- Use `String.startsWith()` to check if the first 4 characters of the string are 'YAKI'
- Use `String.toUpperCase()` to convert the string to uppercase
- Use `String.equals()` to compare two strings

### Solution

```java
String S = input();
System.out.println("Yes" + (S.startsWith("YAKI") ? "" : " No"));
```

### Code

```java
String S = input();
System.out.println("Yes" + (S.startsWith("YAKI") ? "" : " No"));
```

### Output

```
Yes
```
</s>
