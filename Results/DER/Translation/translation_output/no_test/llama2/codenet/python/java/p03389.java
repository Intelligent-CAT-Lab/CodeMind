<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, C = list(map(int, input().split()))

a = sorted([A, B, C])
s = 0

for i in range(0, 2):
    tmp = a[2] - a[i]
    
    s += tmp // 2
    a[i] += tmp // 2 * 2

s += sum(a) % 3

print(s)
```

### Input

```
1 2 3
```

### Output

```
1
```

### Explanation

```
A = 1
B = 2
C = 3

a = [1, 2, 3]

s = 0

for i in range(0, 2):
    tmp = a[2] - a[i]
    
    s += tmp // 2
    a[i] += tmp // 2 * 2

s += sum(a) % 3

print(s)
```

### Hint

- [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
- [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)
- [Sorted](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#sort-java.util.List-)
- [Range](https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html#range-int-int-)
- [Modulo](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#abs-int-)
- [Sum](https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html#sum--)
- [Print](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#println-java.lang.String-)
</s>
