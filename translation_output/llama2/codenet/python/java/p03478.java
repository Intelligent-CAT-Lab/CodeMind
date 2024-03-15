<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n, a, b = map(int, input().split())

sum = 0
for n_i in range(1, n + 1):
	n_orders_sum = 0
	for n_order_i in str(n_i):
		n_orders_sum += int(n_order_i)
	if a <= n_orders_sum and n_orders_sum <= b:
		sum += n_i
print(sum)

```

### Input

- The first line contains three integers, $n$, $a$, and $b$ ($1 \leq n \leq 10^5$, $1 \leq a, b \leq 10^9$).
- The second line contains a single integer, $n$, the number of test cases.
- Each of the following $n$ lines contains three integers, $n$, $a$, and $b$ ($1 \leq n \leq 10^5$, $1 \leq a, b \leq 10^9$).

### Output

- For each test case, output a single integer, the sum of the numbers that satisfy the conditions.

### Constraints

- $1 \leq n \leq 10^5$
- $1 \leq a, b \leq 10^9$
- $1 \leq n \leq 10^5$

### Sample Input

```
10 100 1000
10 100 1000
10 100 1000
10 100 1000
10 100 1000
10 100 1000
10 100 1000
10 100 1000
10 100 1000
10 100 1000
```

### Sample Output

```
1000
1000
1000
1000
1000
1000
1000
1000
1000
1000
```

### Explanation

- The first line contains three integers, $n$, $a$, and $b$ ($1 \leq n \leq 10^5$, $1 \leq a, b \leq 10^9$).
- The second line contains a single integer, $n$, the number of test cases.
- Each of the following $n$ lines contains three integers, $n$, $a$, and $b$ ($1 \leq n \leq 10^5$, $1 \leq a, b \leq 10^9$).

### Hint

- Use a for loop to iterate over the range of $n$.
- Use a for loop to iterate over the range of $n_i$.
- Use a for loop to iterate over the range of $n_order_i$.
- Use a if statement to check if $a \leq n_orders_sum$ and $n_orders_sum \leq b$.
- Use a sum statement to add $n_i$ to the sum.
</s>
