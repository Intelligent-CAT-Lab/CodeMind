<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```

### Solution

```java
String s = input();
if (s.charAt(s.length()-1)=='s') {
    System.out.println(s+"es");
} else {
    System.out.println(s+"s");
}
```
</s>
