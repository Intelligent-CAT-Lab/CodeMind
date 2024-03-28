Here is the Python equivalent of the Java code provided:

```python
def main():
    N = int(input())
    while N > 0:
        sum = 0
        i = 1
        while True:
            sum += i
            if sum >= N:
                print(i)
                N -= i
                break
            i += 1

if __name__ == "__main__":
    main()
```

You can run the provided test case with this Python code. To do so, execute the code and input the number "4" when prompted. The expected output will be:

```
1
3
```
