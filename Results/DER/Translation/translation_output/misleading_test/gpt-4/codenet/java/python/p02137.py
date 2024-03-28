Sure, here is the translated Python code for the given Java code:

```python
p = int(input())
print(p // 500 * 500)
```

Here's how it would work for your test input:

Test input:
```
5700
```

Expected output:
```
5505
```

It appears there's an error in the expected output though; based on the Java code, for an input of `5700`, the output should be `5500` (`5700 / 500 * 500` equals `5500`, not `5505`). The Python code would produce `5500` as the output, not `5505`.

The python code uses integer division `//`, which is equivalent to Java's `/` when used with integers, to ensure the result is an integer. Then it multiplies by `500` to print the result.
