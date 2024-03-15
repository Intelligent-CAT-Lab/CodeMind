<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = raw_input()
print 'x' if s[0]=='x' and s[-1]=='x' else 'o'
```

### Solution

```java
String s = input();
System.out.println("x" + (s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x' ? "" : "o"));
```

### Explanation

```
s = raw_input()
```

```
print 'x' if s[0]=='x' and s[-1]=='x' else 'o'
```

### Code

```java
String s = input();
System.out.println("x" + (s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x' ? "" : "o"));
```
</s>
