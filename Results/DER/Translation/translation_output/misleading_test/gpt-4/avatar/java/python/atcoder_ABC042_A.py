```python
# Read the input from the user
nums = map(int, input().split())  # Read space-separated integers

# Sort the numbers to simplify the condition
sorted_nums = sorted(nums)

# Check if the sorted numbers are 5, 5, and 7
if sorted_nums == [5, 5, 7]:
    print("YES")
else:
    print("NO")
```

With the above Python code, if you provide an input like "5 5 7", you would get the output "YES", but if you provide "5 5 7" as your example provided, the output will be "NO".
