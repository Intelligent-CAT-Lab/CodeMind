Here's the translated Python code with your sample test case:

```python
N = input()

for i, c in enumerate(N):
    if i % 2 == 0:
        if c == 'L':
            print("No")
            break
    else:
        if c == 'R':
            print("No")
            break
    if i == len(N) - 1:
        print("Yes")
```

You can run the above Python code, and when prompted, input "RUDLUDR" to get the expected output "Yes".
