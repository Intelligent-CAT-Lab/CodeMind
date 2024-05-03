import re

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

_PRI = [
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

PRI = {
    '(': 5,
    ')': 0,
    '+': _PRI[0][0],
    '-': _PRI[0][1],
    '*': _PRI[0][2],
    '\0': -1,
}


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
        return '