Here is the translated code from Java to Python:

```python
def main():
    K = int(input())
    A = K // 50
    B = K % 50

    a = [i + A for i in range(50)]

    for i in range(49, 49 - B, -1):
        a[i] += 1

    print(50)
    print(' '.join(str(x) for x in a))

if __name__ == "__main__":
    main()
```

When you provide the input `0`, the script will output:
```
50
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49
```

However, if you wanted to replicate the functionality of the FastScanner class to accept fast inputs for large amounts of data. You might want to use something like `sys.stdin.readline()` in a custom input reader function in Python. Here is an example that includes an input reading function, although it is not necessary for small inputs like '0':

```python
import sys

def input_reader():
    return sys.stdin.readline().strip()

def main():
    K = int(input_reader())
    A = K // 50
    B = K % 50

    a = [i + A for i in range(50)]

    for i in range(49, 49 - B, -1):
        a[i] += 1

    print(50)
    print(' '.join(str(x) for x in a))

if __name__ == "__main__":
    main()
```

To provide an input to this script, you would pipe in the input like this:
```bash
echo "0" | python script.py
```

Please note that in a real-world scenario, Python scripts often use `sys.stdin` for efficient reading of large amounts of input data. However, for simplicity's sake and small-scale inputs, the `input()` function is generally sufficient.
