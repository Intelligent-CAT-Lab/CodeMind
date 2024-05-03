Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    arr = list(s)
    for i in range(len(arr)):
        if arr[i] == 'b':
            arr[i] = 'd'
        elif arr[i] == 'd':
            arr[i] = 'b'
        elif arr[i] == 'p':
            arr[i] = 'q'
        elif arr[i] == 'q':
            arr[i] = 'p'
    arr.reverse()
    if s == ''.join(arr):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, replaces 'b' with 'd', 'd' with 'b', 'p' with 'q', and 'q' with 'p', then reverses the string and checks if it's equal to the original string. If it is, it prints "Yes", otherwise it prints "No".
