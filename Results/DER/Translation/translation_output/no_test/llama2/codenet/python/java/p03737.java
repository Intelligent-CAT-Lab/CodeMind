<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```

### Hint

- Use `String.split()` to split the input string into a list of strings.
- Use `String.charAt()` to get the first character of each string.
- Use `String.concat()` to concatenate the first characters of each string.

### Solution

```java
String s1,s2,s3;
s1=s2=s3=input().toUpperCase();
System.out.println(s1.charAt(0)+s2.charAt(0)+s3.charAt(0));
```
</s>
