class main:
    from collections import deque
    
    class Op:
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
    
    class Num:
        def __init__(self, value):
            self.value = value
    
        def pri(self):
            return 127
    
    def postfix(expr, pri):
        stack = deque()
        stack.append(Nop())
        expr_list = []
    
        for e in expr:
            p1, p2 = pri[stack[-1].pri()], pri[e.pri()]
            while p2 <= p1 and not isinstance(stack[-1], Lp):
                expr_list.append(stack.pop())
                p1 = pri[stack[-1].pri()]
            if not isinstance(e, Rp):
                stack.append(e)
            else:
                stack.pop()
    
        while not isinstance(stack[-1], Nop):
            expr_list.append(stack.pop())
    
        return expr_list
    
    def eval_expr(expr):
        stack = deque()
    
        for e in expr:
            if isinstance(e, Op):
                b, a = stack.pop(), stack.pop()
                stack.append(e.operate(a, b))
            else:
                stack.append(e.value)
    
        return stack.pop()
    
    if __name__ == "__main__":
        line = input()
        words = [w for w in line.replace('+',' + ').replace('-',' - ').replace('*',' * ').split() if w]
    
        expr = []
        for word in words:
            c = word[0]
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
    
        max_val = float("-inf")
        pri = [
            {ord('('): 5, 127: 4, ord('+'): 1, ord('-'): 2, ord('*'): 3, ord(')'): 0, ord('\0'): -1},
            {ord('('): 1, 127: 4, ord('+'): 2, ord('-'): 3, ord('*'): 1, ord(')'): 0, ord('\0'): -1},
            {ord('('): 2, 127: 4, ord('+'): 3, ord('-'): 1, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
            {ord('('): 2, 127: 4, ord('+'): 3, ord('-'): 1, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
            {ord('('): 1, 127: 4, ord('+'): 2, ord('-'): 3, ord('*'): 1, ord(')'): 0, ord('\0'): -1},
            {ord('('): 2, 127: 4, ord('+'): 3, ord('-'): 2, ord('*'): 1, ord(')'): 0, ord('\0'): -1},
            {ord('('): 1, 127: 4, ord('+'): 1, ord('-'): 2, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
            {ord('('): 1, 127: 4, ord('+'): 2, ord('-'): 1, ord('*'): 1, ord(')'): 0, ord('\0'): -1},
            {ord('('): 2, 127: 4, ord('+'): 1, ord('-'): 1, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
            {ord('('): 2, 127: 4, ord('+'): 1, ord('-'): 2, ord('*'): 1, ord(')'): 0, ord('\0'): -1},
            {ord('('): 1, 127: 4, ord('+'): 2, ord('-'): 1, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
            {ord('('): 2, 127: 4, ord('+'): 1, ord('-'): 2, ord('*'): 1, ord(')'): 0, ord('\0'): -1}
        ]
    
        for i in range(len(pri)):
            postfix_expr = postfix(expr, pri[i])
            max_val = max(max_val, eval_expr(postfix_expr))
    
        print(max_val)