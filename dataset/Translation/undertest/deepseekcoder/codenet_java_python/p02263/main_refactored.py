class main:
    class Stack:
        def __init__(self):
            self.array = []
    
        def push(self, value):
            self.array.append(value)
    
        def pop(self):
            return self.array.pop()
    
        def is_empty(self):
            return len(self.array) == 0
    
    def calculate(expression):
        stack = Stack()
        for s in expression.split(" "):
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
        return stack.pop()
    
    print(calculate(input()))