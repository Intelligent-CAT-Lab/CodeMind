<s> Translate the following python code to java and enclose your solution inside ```java```:
```
h, w, s, t = map(int, input().split())
if h * w % 2 == 1:
  if (s + t) % 2 == 1:
    print("No")
  else:
    print("Yes")
else:
  print("Yes")

```

### Input

The first line of input contains an integer `t` denoting the number of test cases.

The first line of each test case contains four space-separated integers `h`, `w`, `s`, `t` denoting the height, width, side length and thickness of the rectangle respectively.

### Output

For each test case, print "Yes" if the rectangle can be cut into two pieces of equal area, or "No" otherwise.

### Constraints

1 <= t <= 100

1 <= h, w, s, t <= 1000

### Example Input

```
3
4 5 2 1
3 4 2 1
2 3 1 1
```

### Example Output

```
Yes
Yes
No
```

### Explanation

For the first test case, the rectangle can be cut into two pieces of equal area.

For the second test case, the rectangle can be cut into two pieces of equal area.

For the third test case, the rectangle cannot be cut into two pieces of equal area.
</s>
