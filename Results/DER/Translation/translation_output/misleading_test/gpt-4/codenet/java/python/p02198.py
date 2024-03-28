Below is the Python translation of the provided Java code:

```python
import sys

def main():
    inputs = input().split()
    N = int(inputs[0])
    M = int(inputs[1])
    print(N * M)

if __name__ == "__main__":
    main()
```

Sample test case in Python (assuming you're running this in a command-line environment and Python is the interpreter):
```
# Test input (typed into console):
3 4
# Expected output:
99
``` 

Please note that in the Java code, the `main` method in `p02198` class is being flagged as `boolean` and is supposed to be returning `false`, while in Python we don't usually flag the return type, and there's no equivalent for the explicit `false` return in this context. The priority in this translation is maintaining the functionality of the input reading and multiplication, similar to the original Java example.
