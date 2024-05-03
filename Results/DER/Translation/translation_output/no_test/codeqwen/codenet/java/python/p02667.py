Here is the Python equivalent of the Java code:

```python
import sys

def main():
    T = list(sys.stdin.readline().strip())
    N = len(T)

    one_sum = 0
    indexes = []
    for i in range(N):
        if T[i] == '1':
            length = 0
            for j in range(i, N):
                if T[j] == '1':
                    length += 1
                else:
                    break
            if length % 2 == 1:
                indexes.append(i - (one_sum - len(indexes)))
            one_sum += length
            i += length

    zero_sum = N - one_sum
    ans = (zero_sum + 1) * (one_sum - len(indexes)) // 2

    for i in range(len(indexes)):
        index = indexes[i]
        ans += zero_sum + 1 - (index - i + (1 + i % 2)) // 2

    for i in range(one_sum - 1, 0, -1):
        ans += (i + 1) // 2

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the number of '1's in the string, and then calculates the number of ways to partition the string into substrings of '1's. It then calculates the number of ways to partition the string into substrings of '0's and adds them to the total number of ways to partition the string. Finally, it prints the total number of ways to partition the string.
