import re

class Node:
    def __init__(self):
        self.cost0 = 0
        self.cost1 = 0

    def get0(self):
        if self.cost0 > 0:
            return self.cost0
        return self.cost0 = self.calc0()

    def get1(self):
        if self.cost1 > 0:
            return self.cost1
        return self.cost1 = self.calc1()

    def calc0(self):
        pass

    def calc1(self):
        pass

class VarNode(Node):
    def calc0(self):
        return 1

    def calc1(self):
        return 1

    def __str__(self):
        return "?"

class AndNode(Node):
    def __init__(self, left, right):
        self.left = left
        self.right = right

    def calc0(self):
        return min(self.left.get0(), self.left.get1() + self.right.get0())

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __str__(self):
        return "({}&{})".format(self.left, self.right)

class OrNode(Node):
    def __init__(self, left, right):
        self.left = left
        self.right = right

    def calc0(self):
        return self.left.get0() + self.right.get0()

    def calc1(self):
        return min(self.left.get1(), self.left.get0() + self.right.get1())

    def __str__(self):
        return "({}|{})".format(self.left, self.right)

class Parser:
    def __init__(self, s):
        self.text = s + "$"
        self.cur = 0

    def get_term(self):
        c = self.text[self.cur]
        if c == '?':
            self.cur += 1
            return VarNode()
        if