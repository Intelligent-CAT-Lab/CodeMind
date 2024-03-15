Here is the translated Python code from the provided Java code:

```python
class Stack:
    MAX = 200

    def __init__(self):
        self.array = [0] * self.MAX
        self.index = 0

    def push(self, value):
        self.array[self.index] = value
        self.index += 1

    def pop(self):
        if self.index == 0:
            raise IndexError("Pop from empty stack")
        self.index -= 1
        return self.array[self.index]

    def is_empty(self):
        return self.index == 0

    def is_full(self):
        return self.index == self.MAX

if __name__ == "__main__":
    stack = Stack()
    line = input()
    
    for s in line.split():
        if s == "+":
            stack.push(stack.pop() + stack.pop())
        elif s == "-":
            first = stack.pop()
            second = stack.pop()
            stack.push(second - first)
        elif s == "*":
            stack.push(stack.pop() * stack.pop())
        else:
            stack.push(int(s))
    
    print(stack.pop())
```

In this Python version, I have replicated the functionality of the Java code. Major changes include using a Python list to implement the stack and the use of Python's built-in exceptions for error handling (in the pop method). The `input()` function in Python is used to read a line from standard input, replacing the `Scanner` system used in Java. The `if __name__ == "__main__":` block is used to ensure that the code runs only when the script is the main program being run, not when it is being imported as a module.
