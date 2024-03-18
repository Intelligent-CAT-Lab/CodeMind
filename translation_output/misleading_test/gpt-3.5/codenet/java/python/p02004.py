```python
def main():
    string = input()

    directions = {'E': 0, 'N': 1, 'W': 2, 'S': 3}
    current_direction = 'N'
    stack = [0]

    result = 0

    for command in string:
        if command == 'R':
            current_direction = (directions[current_direction] + 1) % 4
        else:
            current_direction = (directions[current_direction] - 1) % 4

        if current_direction == 1 and len(stack) == 0:
            stack.append(0)
        elif len(stack) > 0:
            if command == 'L':
                stack.pop()
                if len(stack) == 0:
                    stack = []
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack = []

    print(result)

if __name__ == "__main__":
    main()
```
