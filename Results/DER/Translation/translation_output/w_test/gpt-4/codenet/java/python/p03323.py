Here is the equivalent code in Python:

```python
def main():
    a, b = [int(x) for x in input().split()]
    if a <= 8 and b <= 8:
        print("Yay!")
    else:
        print(":(")

if __name__ == "__main__":
    main()
```

You can use the following test input to match the Java program's expected output in Python:

Test input:
```
5 4
```

Expected output:
```
Yay!
```
