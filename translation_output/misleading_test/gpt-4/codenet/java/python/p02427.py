Here is the translated code from Java to Python:

```python
def print_powerset(n):
    for i in range(2**n):
        temp = i
        print(f"{i}:", end="")
        j = 0
        while temp > 0:
            if temp % 2 == 1:
                print(f" {j}", end="")
            temp //= 2
            j += 1
        print()   # Move to the next line after printing all elements of the subset.

# Sample test case
n = int(input())
print_powerset(n)
```

When you run the Python code with the input `4`, the expected output will be:

```
0:
1: 0
2: 1
3: 0 1
4: 2
5: 0 2
6: 1 2
7: 0 1 2
8: 3
9: 0 3
10: 1 3
11: 0 1 3
12: 2 3
13: 0 2 3
14: 1 2 3
15: 0 1 2 3
```
