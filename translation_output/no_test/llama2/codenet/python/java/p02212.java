<s> Translate the following python code to java and enclose your solution inside ```java```:
```
l = sorted(list(map(int, input().split())))

print(abs((l[0] + l[3]) - (l[1] + l[2])))

```

### Input

```
1 2 3 4 5
```

### Output

```
1
```

### Explanation

```
l = [1, 2, 3, 4, 5]

l[0] = 1
l[1] = 2
l[2] = 3
l[3] = 4
l[4] = 5

l[0] + l[3] = 1 + 4 = 5
l[1] + l[2] = 2 + 3 = 5

abs((l[0] + l[3]) - (l[1] + l[2])) = abs(5 - 5) = 0
```

### Hint

- Use the `sorted()` function to sort the list.
- Use the `map()` function to convert the string to an integer.
- Use the `abs()` function to get the absolute value.
</s>
