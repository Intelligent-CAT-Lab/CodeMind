from collections import deque
import itertools
import re
import sys

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

_PRI = [
    [1, 2, 3],
    [1, 3, 2],
    [2, 1, 3],
    [2, 3, 1],
    [3, 1, 2],
    [3, 2, 1],
    [1, 1, 2],
    [1, 2, 1],
    [2, 1, 1],
    [2, 2, 1],
    [2, 1, 2],
    [1, 2, 2],
    [2, 2, 2],
]

PRI = [
    {'(': 5, chr(127): 4, '+': pri[0], '-': pri[1], '*': pri[2], ')': 0, '\0': -1}
    for pri in _PRI
]

def postfix(expr, pri):
    stack = deque()
    list_ = []

    stack.append(Nop())
    for e in expr:
        p1 = pri[chr(stack[-1].pri())]
        p2 = pri[chr(e.pri())]
        while p2 <= p1 and not isinstance(stack[-1], Lp):
            list_.append(stack.pop())
            p1 = pri[chr(stack[-1].pri())]
        if not isinstance(e, Rp):
            stack.append(e)
        else:
            stack.pop() # remove '('
    while not isinstance(stack[-1], Nop):
        list_.append(stack.pop())
    return list_

def eval_(expr):
    stack = deque()
    for e in expr:
        if isinstance(e, Op):
            b = stack.pop()
            a = stack.pop()
            stack.append(e.operate(a, b))
        else:
            stack.append(e.value)
    return stack.pop()

def main():
    # parse
    line = input()
    words = re.findall(r'\d+|[^0-9]', line)
    expr = []

    for word in words:
        if word.isdigit():
            expr.append(Num(int(word)))
        else:
            expr.append({'(': Lp, ')': Rp, '+': Add, '-': Subtract, '*': Multiply}[word]())

    # solve
    max_result = -(sys.maxsize)
    for prior in PRI:
        max_result = max(max_result, eval_(postfix(expr, prior)))
    print(max_result)

# Test case code
if __name__ == '__main__':
    main()