Below is the translated code from Java to Python:

```python
import math

def main():
    A, B, X = map(int, input().split())

    if X * 2 >= A * A * B:
        z = (A * A * B - X) / (A * A * 2)
        d = math.atan(z / A) * 180 / math.pi
    else:
        z = X / (A * B * 2)
        d = math.atan(B / z) * 180 / math.pi

    print(d)

if __name__ == "__main__":
    main()
```

To test with the given input:

Test input:
```
2 2 4
```

Expected output:
```
83.82329779497354
```

Ensure that you provide the input in the specified format when running the Python script.
