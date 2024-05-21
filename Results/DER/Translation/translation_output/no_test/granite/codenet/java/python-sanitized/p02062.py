import re

class Node:
    def __init__(self):
        self.cost0 = 0
        self.cost1 = 0

    def get0(self):
        if self.cost0 > 0:
            return self.cost0
        self.cost0 = self.calc0()
        return self.cost0

    def get1(self):
        if self.cost1 > 0:
            return self.cost1
        self.cost1 = self.calc1()
        return self.cost1

    def calc0(self):
        raise NotImplementedError()

    def calc1(self):
        raise NotImplementedError()

    def __repr__(self):
        return f"({self.get0()}, {self.get1()})"

class VarNode(Node):
    def calc0(self):
        return 1

    def calc1(self):
        return 1

    def __repr__(self):
        return "?"

class AndNode(Node):
    def __init__(self, left, right):
        super().__init__()
        self.left = left
        self.right = right

    def calc0(self):
        return min(self.left.get0(), self.left.get1() + self.right.get0())

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __repr__(self):
        return f"({self.left} & {self.right})"

class OrNode(Node):
    def __init__(self, left, right):
        super().__init__()
        self.left = left
        self.right = right

    def calc0(self):
        return self.left.get0() + self.right.get0()

    def calc1(self):
        return min(self.left.get1(), self.left.get0() + self.right.get1())

    def __repr__(self):
        return f"({self.left} | {self.right})"

class Parser:
    def __init__(self, s):
        self.text = s + "$"
        self.cur = 0

    def get_term(self):
        c = self.text[self.cur]
        if c == "?":
            self.cur += 1
            return VarNode()
        if c == "(":
            self.cur += 1
            node = self.get_or_expr()
            assert self.text[self.cur] == ")"
            self.cur += 1
            return node
        raise Exception("Invalid character")

    def get_and_expr(self):
        node = self.get_term()
        while self.text[self.cur] == "&":
            self.cur += 1
            r = self.get_term()
            node = AndNode(node, r)
        return node

    def get_or_expr(self):
        node = self.get_and_expr()
        while self.text[self.cur] == "|":
            self.cur += 1
            r = self.get_and_expr()
            node = OrNode(node, r)
        return node

    def get_formula(self):
        return self.get_or_expr()