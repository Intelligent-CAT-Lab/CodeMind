<s> Translate the following python code to java and enclose your solution inside ```java```:
```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### 解题思路

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### 解题思路

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### 解题思路

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### 解题思路

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### 解题思路

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### 解题思路

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### 解题思路

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### 解题思路

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### 解题思路

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
        return 1

    return s[pat]
            
str = input()
print(f(str))


```

### 解题思路

```
#  --*-coding:utf-8-*--

def f(str):
    s = {}
    s[0] = 0
    pat = 0

    bits = [2**i for i in range(26)]
    lenOfStr = len(str)

    for c in str:
        pat ^= bits[ord(c)-97]
        s[pat] = min(
            min(s.get(pat^bit, lenOfStr) + 1 for bit in bits),
            s.get(pat, lenOfStr))

    if pat == 0:
       
