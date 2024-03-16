<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
def decode(s):
    result=""
    for c in s:
        if not (c==" " or c=="."):
            result+=chr(ord(c)+1)
        else:
            result+=c
    return result.replace(chr(ord("z")+1),"a")
for line in sys.stdin.readlines():
    s=line.strip()
    for i in range(ord("z")-ord("a")+1):
        if "the" in s or "that" in s or "this" in s:
            print(s)
            break
        s=decode(s)
```

### Input

```
the quick brown fox jumps over the lazy dog
```

### Output

```
the qick brwon fox jumps over the lazy dog
```

### Explanation

The code is a simple substitution cipher.

### Hint

- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.System` class to write to `stdout`
- Use the `java.lang.System` class to read from `stdin`
- Use the `java.lang.
