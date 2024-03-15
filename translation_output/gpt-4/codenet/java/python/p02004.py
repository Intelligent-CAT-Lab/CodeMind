Below is the translated Java code into Python, enclosed as requested:

```python
from collections import deque

def main():
    str_input = input()

    # 0 is considered North
    dir = 0
    # Use a deque to determine if a full rotation has been made
    # Push with 'R', pop with 'L'
    # If size is 5, then a full rotation is completed, if 0 then the rotation failed
    stack = deque([0])
    result = 0

    for command in str_input:

        # Calculate direction based on the command
        if command == 'R':
            dir += 1
        else:
            dir += 3
        dir %= 4

        # When facing North
        # This is the starting point for the rotation so create a stack
        if dir == 0 and not stack:
            stack = deque([0])
        elif stack:
            # Left rotation
            if command == 'L':
                stack.pop()
                if len(stack) == 0:
                    stack = deque()
            # Right rotation
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack.clear()
                    stack.append(0)

    print(result)

if __name__ == "__main__":
    main()
```

Some notes on the translation:
1. I replaced the Java `Stack` class with Python's `collections.deque` as it's a highly efficient stack implementation in Python and its interface is similar enough for this purpose.
2. Java's `Scanner` functionality for reading input is replaced with Python's built-in `input()` function.
3. The loop `for(int i = 0; i < str.length(); i++)` has been converted to a Python `for...in` loop, which iterates directly over the string.
4. In Java, `System.out.println(result);` is how you print information to the console, whereas, in Python, you simply use `print(result)`.
