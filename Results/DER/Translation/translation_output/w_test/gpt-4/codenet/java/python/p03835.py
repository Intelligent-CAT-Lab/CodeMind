Below is the Python translation for the provided Java code including a `input()` function for capturing the test input:

```python
def count_possible_ways(k, s):
    # search
    count = 0
    for x in range(0, k + 1):
        for y in range(0, k + 1):
            z = s - x - y
            if 0 <= z <= k:
                count += 1
    return count

# input
k, s = map(int, input().split())

# answer
print(count_possible_ways(k, s))
```

To use this code, you should input the values as provided in the test case "2 2" directly into the console when prompted. The expected output with input "2 2" would be 6.
