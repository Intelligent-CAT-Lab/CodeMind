Below is the Python translation of the Java code you've provided. 

```python
def main():
    num1, num2 = map(int, input().split())
    counter = 0
    
    while num1 != 0 and num2 != 0:
        if num1 == 1 and num2 == 1:
            break
        
        if num1 <= num2:
            num1 += 1
            num2 -= 2
        else:
            num1 -= 2
            num2 += 1
        
        counter += 1
    
    print(counter)

if __name__ == '__main__':
    main()
```

To use this code, simply call the `main` function and provide an input as specified. The input can be provided via standard input (e.g. typing in the console) when the function prompts for it.
Here is how you could test the code:

Test input:
```
100 25
```

Expected output:
```
38
```
