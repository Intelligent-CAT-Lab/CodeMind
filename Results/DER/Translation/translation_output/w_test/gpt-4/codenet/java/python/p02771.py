Here's the Java code translated into Python:

```python
A, B, C = map(int, input().split())

if (A == B and B == C) or (A != B and A != C and B != C):
    print("No")
else:
    print("Yes")
```

To run the given test input `5 7 5`, you would use the code above in a Python environment and enter `5 7 5` when prompted for input. The expected output will be `Yes`.
