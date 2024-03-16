Below is the equivalent Python code for the provided Java code sample:

```python
def main():
    a, b, c = map(int, input().split())
    string_a = str(a)
    string_b = str(b)
    string_c = str(c)
    
    if a >= b and a >= c:
        if b >= c:
            print(int(string_a + string_b) + c)
        else:
            print(int(string_a + string_c) + b)
    elif b >= a and b >= c:
        if a >= c:
            print(int(string_b + string_a) + c)
        else:
            print(int(string_b + string_c) + a)
    else:
        if a >= b:
            print(int(string_c + string_a) + b)
        else:
            print(int(string_c + string_b) + a)

if __name__ == '__main__':
    main()
```

You can now use this Python code to test the input and get the expected output:

Test input:
```
1 5 2
```

Expected output:
```
53
```
