<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)
```

### Input

The first line contains an integer $n$ ($1 \leq n \leq 10^5$).

### Output

Print the result of $n^3$ modulo $10^9+7$.

### Constraints

- $1 \leq n \leq 10^5$

### Sample Input

```
10
```

### Sample Output

```
1000000000
```

### Explanation

```
10^3 = 1000
1000 mod 10^9+7 = 1000000000
```

### Hint

- Use the `Scanner` class to read the input.
- Use the `System.out` class to print the output.
- Use the `Math` class to calculate the result.
</s>
