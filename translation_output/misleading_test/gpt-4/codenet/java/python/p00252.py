Below is the Java code translated into Python:

```python
a = [int(x) for x in input().split()]

if a[0] == 1 and a[1] == 1:
    print("Open")
elif a[2] == 1:
    print("Open")
else:
    print("Close")
```

You can test this Python code using the provided test case:

Test input:
`0 0 1`

Expected output:
`Open`
