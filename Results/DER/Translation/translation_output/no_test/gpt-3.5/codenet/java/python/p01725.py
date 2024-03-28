```python
from collections import deque

class p01725:
    def __init__(self):
        pass

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
            return 127

def postfix(expr, pri):
    stack = deque()
    stack.append(p01725().Nop())
    list_output = []

    for e in expr:
        p1, p2 = pri[stack[-1].pri()], pri[e.pri()]
        while p2 <= p1 and not isinstance(stack[-1], p01725().Lp):
            list_output.append(stack.pop())
            p1 = pri[stack[-1].pri()]
        
        if not isinstance(e, p01725().Rp):
            stack.append(e)
        else:
            stack.pop()
    
    while not isinstance(stack[-1], p01725().Nop):
        list_output.append(stack.pop())
    
    return list_output

def eval(expr):
    stack = deque()

    for e in expr:
        if isinstance(e, p01725().Op):
            b = stack.pop()
            a = stack.pop()
            stack.append(e.operate(a, b))
        else:
            stack.append(e.value)
    
    return stack.pop()

if __name__ == "__main__":
    line = input()
    words = [x for x in line.split("(?<!\\d)|(?!\\d)") if x]

    expr = []
    for word in words:
        c = word[0]
        if c == '(':
            expr.append(p01725().Lp())
        elif c == ')':
            expr.append(p01725().Rp())
        elif c == '+':
            expr.append(p01725().Add())
        elif c == '-':
            expr.append(p01725().Subtract())
        elif c == '*':
            expr.append(p01725().Multiply())
        else:
            expr.append(p01725().Num(int(word)))

    max_val = float('-inf')
    PRI = {
        0: {ord('('): 5, 127: 4, ord('+'): 1, ord('-'): 2, ord('*'): 3, ord(')'): 0, ord('\0'): -1},
        1: {ord('('): 5, 127: 4, ord('+'): 1, ord('-'): 3, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
        2: {ord('('): 5, 127: 4, ord('+'): 2, ord('-'): 1, ord('*'): 3, ord(')'): 0, ord('\0'): -1},
        3: {ord('('): 5, 127: 4, ord('+'): 2, ord('-'): 3, ord('*'): 1, ord(')'): 0, ord('\0'): -1},
        4: {ord('('): 5, 127: 4, ord('+'): 3, ord('-'): 1, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
        5: {ord('('): 5, 127: 4, ord('+'): 3, ord('-'): 2, ord('*'): 1, ord(')'): 0, ord('\0'): -1},
        6: {ord('('): 5, 127: 4, ord('+'): 1, ord('-'): 1, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
        7: {ord('('): 5, 127: 4, ord('+'): 1, ord('-'): 2, ord('*'): 1, ord(')'): 0, ord('\0'): -1},
        8: {ord('('): 5, 127: 4, ord('+'): 2, ord('-'): 1, ord('*'): 1, ord(')'): 0, ord('\0'): -1},
        9: {ord('('): 5, 127: 4, ord('+'): 2, ord('-'): 2, ord('*'): 1, ord(')'): 0, ord('\0'): -1},
        10: {ord('('): 5, 127: 4, ord('+'): 2, ord('-'): 1, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
        11: {ord('('): 5, 127: 4, ord('+'): 1, ord('-'): 2, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
        12: {ord('('): 5, 127: 4, ord('+'): 2, ord('-'): 2, ord('*'): 2, ord(')'): 0, ord('\0'): -1},
    }

    for i in range(13):
        max_val = max(max_val, eval(postfix(expr, PRI[i])))
    
    print(max_val)
```

