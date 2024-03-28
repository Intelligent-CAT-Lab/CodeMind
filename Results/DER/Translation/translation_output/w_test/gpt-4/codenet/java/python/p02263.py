Below is the translated Python code which replicates the functionality of the provided Java code. This simple program implements a postfix calculator that takes in an input of space-separated numbers and operations and then outputs the result of the computation.

```python
class Stack:
    def __init__(self):
        self.array = []
    
    def push(self, value):
        self.array.append(value)
    
    def pop(self):
        if not self.is_empty():
            return self.array.pop()
        else:
            raise IndexError("pop from empty stack")
    
    def is_empty(self):
        return len(self.array) == 0

    def is_full(self):  # This function is not used since Python list can grow dynamically
        return False


def main():
    stack = Stack()
    line = input()  # using input() instead of Scanner
    for s in line.split(" "):
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

if __name__ == "__main__":
    main()
```

Provided that you input "1 2 +", this script should output `3` as expected, thus mirroring the same behavior as the given Java code.
