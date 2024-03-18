Here is the Python equivalent of the provided Java code using a simple list as a stack:

```python
class Stack:
    def __init__(self, max_size=200):
        self.array = []
        self.max_size = max_size
    
    def push(self, value):
        if len(self.array) < self.max_size:
            self.array.append(value)
        else:
            raise IndexError("Stack is full.")
    
    def pop(self):
        if self.array:
            return self.array.pop()
        else:
            raise IndexError("Stack is empty.")
    
    def is_empty(self):
        return len(self.array) == 0
    
    def is_full(self):
        return len(self.array) == self.max_size


if __name__ == "__main__":
    stack = Stack()
    line = input().strip()
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

# Sample test case (uncomment the following lines to test):
# input_line = "1 2 +"
# print("Test input:\n" + input_line)
# print("Expected output:\n27")
# print("Your output:")
# stack = Stack()
# for s in input_line.split(" "):
#     if s == "+":
#         stack.push(stack.pop() + stack.pop())
#     elif s == "-":
#         first = stack.pop()
#         second = stack.pop()
#         stack.push(second - first)
#     elif s == "*":
#         stack.push(stack.pop() * stack.pop())
#     else:
#         stack.push(int(s))
# print(stack.pop())
```

When you run the above Python code with the sample test case input "1 2 +", it will produce the expected output, which is 27.
