Here's the equivalent Python code for the given Java program:

```python
def main():
    T = input().strip()
    N = len(T)
    
    oneSum = 0
    indexes = []
    i = 0
    while i < N:
        if T[i] == '1':
            length = 0
            j = i
            while j < N and T[j] == '1':
                length += 1
                j += 1
            if length % 2 == 1:
                indexes.append(i - (oneSum - len(indexes)))
            oneSum += length
            i += length - 1
        i += 1
    
    zeroSum = N - oneSum
    ans = (zeroSum + 1) * (oneSum - len(indexes)) // 2
    
    for i, index in enumerate(indexes):
        ans += zeroSum + 1 - (index - i + (1 + i % 2)) // 2
    
    for i in range(oneSum - 1, 0, -1):
        ans += (i + 1) // 2
    
    print(ans)

# Run the main function
main()
```

In this Python version, I've used a `while` loop with a manual increment to handle a similar behavior to the nested loop in Java. The `//` operator is used for integer division like the `/` operator in Java. The `enumerate` function is used to iterate through the list `indexes` with both the index and the value available in the loop. Note that the `input()` function is used in Python for reading from the standard input and `strip()` is used to remove any trailing newline characters.
