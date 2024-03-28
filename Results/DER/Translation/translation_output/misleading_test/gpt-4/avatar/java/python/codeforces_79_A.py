Here is the equivalent Python code for the given Java code:

```python
def can_take(x_needed, x_available, y_needed, y_available):
    if x_needed > x_available:
        return False
    if y_needed > y_available:
        return False
    return True

def main():
    x, y = map(int, input().split())
    turn = 0
    while True:
        if turn % 2 == 0:
            if can_take(2, x, 2, y):
                x -= 2
                y -= 2
            elif can_take(1, x, 12, y):
                x -= 1
                y -= 12
            elif can_take(0, x, 22, y):
                y -= 22
            else:
                print("Hanako")
                return
        else:
            if can_take(0, x, 22, y):
                y -= 22
            elif can_take(1, x, 12, y):
                x -= 1
                y -= 12
            elif can_take(2, x, 2, y):
                x -= 2
                y -= 2
            else:
                print("Ciel")
                return
        turn += 1

if __name__ == "__main__":
    main()
```

Here is an example test case you can use to validate the Python code:

Test input:
```
1 20
```

Expected output:
```
Ciel
```

To test the code, run the script and provide the input when prompted. The script will then print out the expected output.
