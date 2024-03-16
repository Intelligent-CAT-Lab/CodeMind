
```java

```


```

java code:
```java

```
/problems/0001/README.md
# Problem 1

Translate the following python code to java and enclose your solution inside ```java```:
```
N=input()

memo={}
memo[0]=1
memo[1]=2

def func(N):
    if N in memo:
        return memo[N]
    result= ( func(N/2)+func((N-1)/2)+func(N/2-1) )% (10**9+7)
    
    memo[N]=result
    return result

print func(N)/problems/0002/README.md
# Problem 2

Translate the following python code to java and enclose your solution inside ```java```:
```
N=input()

memo={}
memo[0]=1
memo[1]=2

def func(N):
    if N in memo:
        return memo[N]
    result= ( func(N/2)+func((N-1)/2)+func(N/2-1) )% (10**9+7)
    
    memo[N]=result
    return result

print func(N)

```

java code:
```java

```

