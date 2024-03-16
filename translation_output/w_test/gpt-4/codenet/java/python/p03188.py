The following Python code is a translation of the given Java code. Note that instead of the custom input parsing methods from the original code, we use Python's built-in `input()` function. Also, threads and manual flushing of the output are not necessary in Python for such small tasks, so they were omitted.

```python
def solve(k):
    if k == 1:
        print(1)
        print(1)
        return
      
    n = ((k + 3) // 4) * 2
    
    ret = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(n):
            ret[i][j] = (0 if i % 2 == 0 else n) + (i + j) % n
    
    for i in range(n):
        for j in range(n):
            if ret[i][j] >= k:
                ret[i][j] = (ret[i][j] - n) % k
    
    print(n)
    for i in range(n):
        for j in range(n):
            print(ret[i][j] + 1, end=" ")
        print()

# Test input
k = int(input())
solve(k)
```

To run the test case with input 2, you would run the script and input 2 when prompted:

```
2
```

The expected output would be:

```
2
1 2
2 1
```
