
```python
import sys

PRI = [
    [1, 2, 3],
    [1, 3, 2],
    [2, 1, 3],
    [2, 3, 1],
    [3, 1, 2],
    [3, 2, 1],
    #
    [1, 1, 2],
    [1, 2, 1],
    [2, 1, 1],
    #
    [2, 2, 1],
    [2, 1, 2],
    [1, 2, 2],
    #
    [2, 2, 2],
]

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
        return '('

class Rp(Op):
    def operate(self, a, b):
        return 0

    def pri(self):
        return ')'

class Add(Op):
    def operate(self, a, b):
        return a + b

    def pri(self):
        return '+'

class Subtract(Op):
    def operate(self, a, b):
        return a - b

    def pri(self):
        return '-'

class Multiply(Op):
    def operate(self, a, b):
        return a * b

    def pri(self):
        return '*'

class Nop(Op):
    def operate(self
