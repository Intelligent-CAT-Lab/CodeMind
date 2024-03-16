Here's the provided Java code translated to Python:

```python
import re
from collections import deque

PRI = [
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

# Priority list
for _pri in PRI:
    _pri.extend([0] * 128)
    _pri[ord('(')] = 5
    _pri[127] = 4
    _pri[ord('+')] = _pri[0]
    _pri[ord('-')] = _pri[1]
    _pri[ord('*')] = _pri[2]
    _pri[ord(')')] = 0
    _pri[0] = -1


class Elm:
    def pri(self):
        raise NotImplementedError


class Op(Elm):
    def operate(self, a, b):
        raise NotImplementedError


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
    list_ = []

    stack.append(Nop())
    for e in expr:
        while not isinstance(stack[-1], Lp) and pri[stack[-1].pri()] >= pri[e.pri()]:
            list_.append(stack.pop())
        if not isinstance(e, Rp):
            stack.append(e)
        else:
            # remove '('
            stack.pop()

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


# Solve
line = input()
words = re.split(r'(?<!\d)|(?!\d)', line)
expr = []

for word in words:
    if word == '(':
        expr.append(Lp())
    elif word == ')':
        expr.append(Rp())
    elif word == '+':
        expr.append(Add())
    elif word == '-':
        expr.append(Subtract())
    elif word == '*':
        expr.append(Multiply())
    else:
        expr.append(Num(int(word)))

max_value = float('-inf')
for pri in PRI:
    max_value = max(max_value, eval_(postfix(expr, pri)))
print(max_value)
```

Please note that the above Python translation attempts to maintain the structure and logic of the original Java code. However, certain Java-specific constructs like interfaces and inner classes have direct alternatives in Python, so I used inheritance and simple classes instead. The Java main method is structured as part of an object instantiation and setup in Java, while in Python, it's a simple sequence of statements for input, processing, and output.
