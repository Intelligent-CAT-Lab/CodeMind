class Elm:
    def pri(self):
        pass

class Op(Elm):
    def operate(self, a, b):
        pass

class Lp(Op):
    def operate(self, a, b):
        return 0
    
    def pri(self):
        return ord('(')

class Rp(Op):
    def operate(self, a, b):
        return 0
    
    def pri(self):
        return ord(')')

class Add(Op):
    def operate(self, a, b):
        return a + b
    
    def pri(self):
        return ord('+')

class Subtract(Op):
    def operate(self, a, b):
        return a - b

    def pri(self):
        return ord('-')

class Multiply(Op):
    def operate(self, a, b):
        return a * b

    def pri(self):
        return ord('*')

class Nop(Op):
    def operate(self, a, b):
        return 0
    
    def pri(self):
        return 0

class Num(Elm):
    def __init__(self, value):
        self.value = value

    def pri(self):
        return ord('\0') if self.value == 127 else 127

def postfix(expr, pri):
    stack = [Nop()]
    list_expr = []

    for e in expr:
        p1 = pri[stack[-1].pri()]
        p2 = pri[e.pri()]
        while p2 <= p1 and not isinstance(stack[-1], Lp):
            list_expr.append(stack.pop())
            p1 = pri[stack[-1].pri()]
        
        if not isinstance(e, Rp):
            stack.append(e)
        else:
            stack.pop()
    
    while not isinstance(stack[-1], Nop):
        list_expr.append(stack.pop())

    return list_expr

def eval_expr(expr):
    stack = []
    
    for e in expr:
        if isinstance(e, Op):
            b = stack.pop()
            a = stack.pop()
            stack.append(e.operate(a, b))
        else:
            stack.append(e.value)
    
    return stack.pop()

if __name__ == '__main__':
    line = input()
    words = [c for c in line]

    expr = []
    for word in words:
        c = word
        if c == '(':
            expr.append(Lp())
        elif c == ')':
            expr.append(Rp())
        elif c == '+':
            expr.append(Add())
        elif c == '-':
            expr.append(Subtract())
        elif c == '*':
            expr.append(Multiply())
        else:
            expr.append(Num(int(word)))

    max_result = float('-inf')
    for i in range(len(PRI)):
        max_result = max(max_result, eval_expr(postfix(expr, PRI[i])))

    print(max_result)