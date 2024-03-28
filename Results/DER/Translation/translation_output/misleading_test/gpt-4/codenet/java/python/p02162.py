Here's the Java code translated into Python:

```python
t1, t2, r1, r2 = map(int, input().split())
if r1 == -1 or r2 == -1:
    r1 = -t1
    r2 = -t2
if r1 == r2:
    print("Draw")
elif r1 < r2:
    print("Bob")
else:
    print("Alice")
```

If you input '9 8 1000 999', the output will be 'Alice' as expected from the test case provided.
