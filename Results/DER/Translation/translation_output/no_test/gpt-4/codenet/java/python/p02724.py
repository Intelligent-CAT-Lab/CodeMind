Here's the equivalent Python code for the Java code provided:

```python
if __name__ == "__main__":
    X = int(input())
    
    gohyaku = X // 500
    X = X - 500 * gohyaku
    
    goen = X // 5
    
    print(1000 * gohyaku + 5 * goen)
```

This Python code emulates the behavior of the original Java program, reading an integer from standard input, then calculating the quantities of 500 and 5 valued units, and finally outputting the sum of 1000 times the number of 500 units plus 5 times the number of 5 units.
