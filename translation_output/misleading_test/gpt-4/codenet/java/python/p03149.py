Below is the translated Python code that provides the same functionality as the provided Java code:

```python
# Read input numbers as space-separated integers from the user
N = list(map(int, input().split()))

# Sort the list of numbers
N.sort()

# Compare if the sorted list matches the specified condition
ans = N == [1, 4, 7, 9]

# Print the result
if ans:
    print("YES")
else:
    print("NO")
```

To test this with the given input, you would run the script and type the input `1 7 9 4` followed by Enter. It should produce the output "YES" as expected.
