Below is the equivalent Python code for the provided Java snippet:
```python
input_values = input().split()
r = int(input_values[0])
d = int(input_values[1])
x = int(input_values[2])

for _ in range(10):
    x = r * x - d
    print(x)
```

Now, if we use the test input `2 1 2` as specified:

```plaintext
Input:
2 1 2

Expected Output:
3
5
9
17
33
65
129
257
513
1025
```

The converted Python code would work the same way as the original Java code, producing the expected output when the input `2 1 2` is provided.
