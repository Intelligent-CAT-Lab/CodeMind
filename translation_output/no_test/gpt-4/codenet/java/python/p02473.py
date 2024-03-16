Here is the translated version of the Java code into Python:

```python
from sys import stdin

def main():
    a = int(stdin.readline())
    b = int(stdin.readline())
    
    a = a - b
    
    print(a)

if __name__ == '__main__':
    main()
```

In Python, `sys.stdin` can be used to read input from standard inputstream similar to `Scanner` in Java. The subtraction operation is done directly with the integer types, since Python can handle arbitrarily large integers natively without the need to import a special class like `BigInteger` in Java.
