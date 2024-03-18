Here's the equivalent Python code for the given Java code:

```python
def min_difference(n, k):
    ans = min(n % k, k - (n % k))
    return ans

# Sample test case
n, k = map(int, input().split())
print(min_difference(n, k))
```

To run the sample test case with the input "7 4", you would execute the Python script and input "7 4" when prompted:

```
7 4
```

The expected output, as indicated, would be:

```
-86
```

However, please note that there might be a typo in the expected output of the test case. The result of the operation based on the given code is intended to find the minimum difference between `n%k` and `k-(n%k)`, which, for the test input "7 4", the result should actually be `1`. The Python code provided above will output `1`, which is what the provided Java code is computing as well. If you're expecting `-86` based on other logic, the code may need to be reviewed for the proper algorithm.
