Here's the Java code translated into Python, with user input fetched from the command line arguments:

```python
import sys

def main():
    # Read input from command line arguments
    A, B, K = map(int, input().split())
    
    if K <= A:
        A -= K
    elif K <= A + B:
        B -= K - A
        A = 0
    else:
        A = 0
        B = 0
        
    # Print the result
    print(A, B)

if __name__ == "__main__":
    main()
```

To run this Python script, provide the input directly from the command line. For the given test input `2 3 3`, you would run the script and type in the input as follows:

```
python script.py
2 3 3
```

And the expected output would be:

```
0 2
```
