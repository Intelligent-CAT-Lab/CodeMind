```python
class Stack:
    def __init__(self):
        self.MAX = 200
        self.array = [0] * self.MAX
        self.index = 0

    def push(self, value):
        self.array[self.index] = value
        self.index += 1

    def pop(self):
        self.index -= 1
        return self.array[self.index]

    def is_empty(self):
        return self.index == 0

    def is_full(self):
        return self.index == self.MAX

def main():
    stack = Stack()
    line = input().strip()
    for s in line.split(' '):
        if s == '+':
            stack.push(stack.pop() + stack.pop())
        elif s == '-':
            first = stack.pop()
            second = stack.pop()
            stack.push(second - first)
        elif s == '*':
            stack.push(stack.pop() * stack.pop())
        else:
            stack.push(int(s))
    
    print(stack.pop())

if __name__ == '__main__':
    main()
```
```
