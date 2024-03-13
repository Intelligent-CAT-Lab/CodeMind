import sys
import re
from collections import deque

class Elm:
    def __init__(self, value):
        self.value = value

    def pri(self):
        return 127

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

class