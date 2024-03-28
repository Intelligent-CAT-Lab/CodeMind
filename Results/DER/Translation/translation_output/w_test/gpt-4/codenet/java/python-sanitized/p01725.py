import re
import itertools
from collections import deque

# Define the Element interface and various operation classes
class Element:
    def priority(self):
        pass

class Operation(Element):
    def operate(self, a, b):
        pass

class LeftParenthesis(Operation):
    def operate(self, a, b):
        return 0

    def priority(self):
        return '('

class RightParenthesis(Operation):
    def operate(self, a, b):
        return 0

    def priority(self):
        return ')'

class Addition(Operation):
    def operate(self, a, b):
        return a + b

    def priority(self):
        return '+'

class Subtraction(Operation):
    def operate(self, a, b):
        return a - b

    def priority(self):
        return '-'

class Multiplication(Operation):
    def operate(self, a, b):
        return a * b

    def priority(self):
        return '*'

class NoOperation(Operation):
    def operate(self, a, b):
        return 0

    def priority(self):
        return 0

class Number(Element):
    def __init__(self, value):
        self.value = value

    def priority(self):
        return 127

# Define priorities
PRIORITIES = list(map(lambda x: { '+': x[0], '-': x[1], '*': x[2], '(': 5, chr(127): 4, ')': 0, '\0': -1 },
                         itertools.chain(itertools.permutations([1, 2, 3]),
                                         itertools.permutations([1, 1, 2]),
                                         itertools.permutations([2, 1, 1]),
                                         [(2, 2, 1), (2, 1, 2), (1, 2, 2)],
                                         [(2, 2, 2)])))

#