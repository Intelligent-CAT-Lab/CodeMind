import re
import sys
from collections import deque

class Elm:
    def __init__(self, value):
        self.value = value

class Op(Elm):
    def operate(self, a, b):
        pass

class Lp(Op):
    def operate(self, a, b):
        return 0

class Rp(Op):
    def operate(self, a, b):
        return 0

class Add(Op):
    def operate(self, a, b):
        return a + b

class Subtract(Op):
    def operate(self, a, b):
        return a -