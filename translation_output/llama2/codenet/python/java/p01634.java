<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a = input()

if len(a) < 6:
    print("INVALID")
else:
    m = 0
    n = 0
    l = 0
    for i in range(len(a)):
        if 48 <= ord(a[i]) <= 57:
            m += 1
        if 97 <= ord(a[i]) <= 122:
            n += 1
        if 65 <= ord(a[i]) <= 90:
            l += 1
    if m == 0 or n == 0 or l == 0:
        print("INVALID")
    else:
        print("VALID")

```

### Solution

```java
String a = input();

if (a.length() < 6) {
    print("INVALID");
} else {
    int m = 0;
    int n = 0;
    int l = 0;
    for (int i = 0; i < a.length(); i++) {
        if (48 <= a.charAt(i) && a.charAt(i) <= 57) {
            m++;
        }
        if (97 <= a.charAt(i) && a.charAt(i) <= 122) {
            n++;
        }
        if (65 <= a.charAt(i) && a.charAt(i) <= 90) {
            l++;
        }
    }
    if (m == 0 || n == 0 || l == 0) {
        print("INVALID");
    } else {
        print("VALID");
    }
}
```
</s>
