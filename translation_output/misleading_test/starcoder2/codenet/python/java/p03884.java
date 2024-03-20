

```java

```


```

java code:

```java

```
/2020/01/2020-01-01.md
# 2020-01-01

## 1. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```
mod = 10**18 + 3

def frac(limit):
    frac = [1]*limit
    for i in range(2,limit):
        frac[i] = i * frac[i-1]%mod
    fraci = [None]*limit
    fraci[-1] = pow(frac[-1], mod -2, mod)
    for i in range(-2, -limit-1, -1):
        fraci[i] = fraci[i+1] * (limit + i + 1) % mod
    return frac, fraci
frac, fraci = frac(1341)
def comb(a, b):
    if not a >= b >= 0:
        return 0
    return frac[a]*fraci[b]*fraci[a-b]%mod

K = int(input())
seg = 2**7
OT = 'EESSTTIIVVAALL'

L = [0]*301
for i in range(300, -1, -1):
    ci = sum(comb(j+i, i)*2**j for j in range(8)) 
    L[i] = K//ci
    K %= ci
    

ans = 'F'*K + 'ESTIVAL'
for l in L:
    ans = l*'F' + OT + ans

print(ans)
```

java code:

```java

```

## 2. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 3. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```/2020/01/2020-01-02.md
# 2020-01-02

## 1. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 2. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 3. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```
/2020/01/2020-01-03.md
# 2020-01-03

## 1. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 2. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 3. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 4. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 5. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 6. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 7. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 8. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 9. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 10. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 11. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 12. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 13. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 14. 

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:

Expected output:

```

```

java code:

```java

```

## 1
