Here is the Java code translated into Python:

```python
# Python program based on the provided Java code

def main():
    # Read inputs as integers
    x, y = map(int, input().split())
    
    # Check if x is divisible by y
    if x % y == 0:
        print(-1)
    else:
        print(x)

# Call main function
if __name__ == "__main__":
    main()
```

Given your test input:

```
8 6
```

The output should be:

```
16
```

However, there is an inconsistency in this example. The Java code provided would output -1 for the provided test case, since 8 modulo 6 is not 0. The correct expected output for the Java code (and thus for the translated Python code) given test input "8 6" should be:
```
8
``` 

The reason why it would output 8 rather than 16 is that it checks if `x` is divisible by `y` and only outputs `-1` if it is. Since 8 is not divisible by 6, it just prints out the value of `x`, which is 8. 

So the correct expected output should be `8`.
