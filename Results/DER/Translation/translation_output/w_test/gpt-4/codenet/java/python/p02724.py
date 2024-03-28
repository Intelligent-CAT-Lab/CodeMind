Here is the translated version of the given Java code into Python:

```python
def main():
    X = int(input())
    
    gohyaku = X // 500
    X -= 500 * gohyaku
    
    goen = X // 5
    
    print(1000 * gohyaku + 5 * goen)

if __name__ == "__main__":
    main()
```

If you wish to test the code, you can use this sample test case as input and verify the output:

```python
# Input
X = 1024

# Test
gohyaku = X // 500
X -= 500 * gohyaku

goen = X // 5

# Expected Output
print(1000 * gohyaku + 5 * goen)  # Should print 2020
```
The Python script uses integer division (`//`) akin to the integer division in Java to ensure that the quotient is an integer value. Python's `print` function is used to print the result, as opposed to Java's `System.out.println`.
