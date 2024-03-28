Here is the Python equivalent of the given Java code:

```python
nums = input().split()
nums = [int(num) for num in nums]  # Convert strings to integers

if nums.count(7) == 1 and nums.count(5) == 2:
    print("YES")
else:
    print("NO")
```

When you run this Python code with the input "5 5 7", it will provide the expected output "YES".
