Here's the translated Python code:

```python
def is_palin(s):
    return s == s[::-1]

def main():
    n = int(input())
    for i in range(n+1):
        if is_palin(str(n-i)):
            print(n-i)
            break
        if is_palin(str(n+i)):
            print(n+i)
            break

if __name__ == '__main__':
    main()
```

Don't forget to test it using the provided test case:

Test input:
```
13
```

Expected output:
```
11
```
