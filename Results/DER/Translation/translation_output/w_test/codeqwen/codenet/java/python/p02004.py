Here is the Python equivalent of the Java code:

```python
import sys

def main():
    str = sys.stdin.readline().strip()
    dir = 0
    stack = [0]
    result = 0

    for i in range(len(str)):
        command = str[i]

        if command == 'R':
            dir += 1
        else:
            dir += 3

        dir %= 4

        if dir == 0 and stack is None:
            stack = [0]
        elif stack is not None:
            if command == 'L':
                stack.pop()
                if len(stack) == 0:
                    stack = None
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack = [0]

    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, then iterates over each character in the string. If the character is 'R', it increments the direction by 1. If the character is 'L', it decrements the direction by 3. The direction is then taken modulo 4 to ensure it stays within the range of 0 to 3.

If the direction is 0 and the stack is None, it creates a new stack with a single element 0. If the stack is not None, it checks if the command is 'L'. If it is, it pops the last element from the stack. If the stack becomes empty, it sets the stack to None. If the command is not 'L', it appends a new element 0 to the stack. If the stack becomes full (i.e., it has 5 elements), it increments the result by 1 and clears the stack.

Finally, it prints the result.
