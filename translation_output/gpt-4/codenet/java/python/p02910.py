Below is the provided Java code translated into Python:

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
