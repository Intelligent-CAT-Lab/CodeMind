Here is the translated Python code that corresponds to the provided Java code:

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

# The sample test case input "1 20" can be given here
if __name__ == '__main__':
    main()
```

When you run this Python program with the input `1 20`, the expected output will be `Ciel`, which matches the expected output of the original Java code.
