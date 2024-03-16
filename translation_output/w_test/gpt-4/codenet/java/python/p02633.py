Here's the translated version of the given Java code into Python:

```python
import sys

class hayami:
    def __enter__(self):
        return self
    
    def __exit__(self, exc_type, exc_val, exc_tb):
        pass
    
    def saori_hayami(self):
        return int(sys.stdin.readline())
    
with hayami() as saori:
    n = saori.saori_hayami()
    i = 1
    while True:
        if i * n % 360 == 0:
            print(i)
            break
        i += 1
```

This Python code assumes you are getting the input from stdin, similar to the original Java program. The `hayami` class has been created to function as a context manager, allowing the use of the `with` statement to closely mimic the try-with-resources statement from Java. However, since Python file streams do not need to be explicitly closed as in Java, the `__exit__` method is simply passing through without any real functionality.

The logic inside the `main` method has been moved into the `with` context block. The `saori_hayami` method reads an integer from stdin and parses it to an `int`. The loop that determines the minimal number `i` such that `i * n % 360 == 0` is directly ported to Python.

Please note that unlike in the Java program, error handling, such as catching exceptions for `IOError` or `ValueError`, is not included here, as the example provided does not contain error cases and Python's context manager cleanly handle potential resource management issues.

To execute this code for a test input, you'd typically pipe the input into the script, like so:

```bash
echo "90" | python script.py
```

This would result in the output `4`, as expected for the given test case.
