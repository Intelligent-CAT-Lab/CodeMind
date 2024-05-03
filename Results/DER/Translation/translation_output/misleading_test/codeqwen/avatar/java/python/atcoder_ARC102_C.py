Here is the Python version of the Java code:

```python
mod = 998244353
nchoosek = [[0 for _ in range(4001)] for _ in range(4001)]

nchoosek[0][0] = nchoosek[0][0] = 1

for i in range(2, nchoosek.__len__()):
    for j in range(1, i):
        nchoosek[i][j] = (nchoosek[i - 1][j] + nchoosek[i - 1][j - 1]) % mod

k = int(input())
n = int(input())

for i in range(2, 2 * k + 1):
    pairs = 0
    if i > k:
        pairs = k - i // 2
    else:
        pairs = (i - 1) // 2

    active = k - 2 * pairs

    if i % 2 == 0:
        active -= 1

    times2 = 1
    total = 0

    for j in range(pairs + 1):
        choice = times2 * nchoosek[pairs][j] % mod
        times2 = times2 * 2 % mod

        if active + j - 1 < 0:
            continue

        total += choice * nchoosek[n + active - 1][active + j - 1]

        if i % 2 == 0:
            total += choice * nchoosek[n + active - 2][active + j - 1]

        total %= mod

    print(total)
```

This Python code does the same thing as the Java code. It calculates the number of ways to choose pairs of numbers from a set of `n` numbers such that the sum of the numbers is less than or equal to `2k`. It uses dynamic programming to calculate the number of combinations, and then uses a loop to calculate the total number of ways to choose pairs of numbers that satisfy the condition. The result is printed out for each possible number of pairs.
