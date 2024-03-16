Here is the equivalent Python code for the provided Java code:

```python
import sys

def main():
    # Equivalent to ni() in Java
    N = int(input())
    
    # Calculate initial m and length l
    l = len(str(N))
    m = 0
    for i in range(l):
        m = (10 * m + 7) % N
    
    # Prepare array to mark visited numbers
    i = l
    vis = [False] * N
    
    while True:
        if vis[m]:
            print(-1)  # Equivalent to out.println(-1);
            break
        
        vis[m] = True
        
        if m == 0:
            print(i)  # Equivalent to out.println(i);
            break
        
        m = (10 * m + 7) % N
        i += 1
        
    # No need to manually close files in Python

# If this script is the main script being run, execute main()
if __name__ == '__main__':
    main()
```

Test input:
```
101
```

Expected output:
```
4
```

In the conversion, I've made the following changes:
- Removed all unnecessary Java I/O setup, as simply using `input()` for reading and `print()` for writing is sufficient in Python.
- Replaced the integer parsing with equivalent Python functions.
- Replaced Java's `boolean` array with a Python list initialized with `False` values.
- Rewrote the loops to accommodate Python's zero-based indexing.
- Removed the `MOD` constant as it was not used in the main method.
- Simplified file I/O-related functions since we are reading from stdin and writing to stdout. 

Now the code can be directly executed to process the input and provide the output as intended.
