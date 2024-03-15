<s> Translate the following python code to java and enclose your solution inside ```java```:
```
print(str(input())[:-8])
```

### Hint

- The first line is a comment.
- The second line is a print statement.
- The third line is an input statement.
- The fourth line is a string method.
- The fifth line is a slice method.

### Solution

```java
System.out.println(new String(input().getBytes()).substring(0, -8));
```

### Explanation

- The first line is a comment.
- The second line is a print statement.
- The third line is an input statement.
- The fourth line is a string method.
- The fifth line is a slice method.
</s>
