Here is the Java code translated into Python:

```python
def can_take(x_needed, x_available, y_needed, y_available):
    return x_needed <= x_available and y_needed <= y_available

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

if __name__ == '__main__':
    main()
```

This Python code reads two integers from the input, simulates the game turns, and outputs the winner's name. Python's syntax does not require explicit type declarations and uses indentation for block structuring instead of braces, which results in more concise and readable code. Remember that Python uses the `print` function to produce output instead of `System.out.println`.
