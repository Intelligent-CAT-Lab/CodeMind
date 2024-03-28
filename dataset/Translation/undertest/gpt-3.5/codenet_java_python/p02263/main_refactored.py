class main:
    class Stack:
        def __init__(self):
            self.MAX = 200
            self.array = [0] * self.MAX
            self.index = 0
            
        def push(self, value):
            self.array[self.index] = value
            self.index += 1
            
        def pop(self):
            value = self.array[self.index - 1]
            self.index -= 1
            return value
            
        def is_empty(self):
            return self.index == 0
        
        def is_full(self):
            return self.index == self.MAX + 1
    
    def evaluate_expression(expression):
        stack = Stack()
        for s in expression.split():
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
        return stack.pop()
    
    if __name__ == '__main__':
        expression = input()
        result = evaluate_expression(expression)
        print(result)