Here is the Python translation of your provided Java code:

```python
def main():
    n = int(input())
    minute = 12 * 60 * n // 360
    print(f"{minute // 60} {minute % 60}")

if __name__ == "__main__":
    main()
```

A test input for the Python code would be handled the same way as in Java:

Test input:
```
0
```

Expected output:
```
0 0
```
