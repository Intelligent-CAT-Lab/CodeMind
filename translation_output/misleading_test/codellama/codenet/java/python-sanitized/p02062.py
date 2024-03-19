import re

class Node:
    def __init__(self, cost0=0, cost1=0):
        self.cost0 = cost0
        self.cost1 = cost1

    def get0(self):
        if self.cost0 > 0:
            return self.cost0
        return self.cost0 = self.calc0()

    def get1(self):
        if self.cost1 > 0:
            return self.cost1
        return self.cost1 = self.calc1()

    def calc0(self):
        raise NotImplementedError

    def calc1(self):
        raise NotImplementedError

class VarNode(Node):
    def __init__(self):
        super().__init__(1, 1)

    def calc0(self):
        return 1

    def calc1(self):
        return 1

    def __str__(self):
        return "?"

class AndNode(Node):
    def __init__(self, left, right):
        super().__init__(left.get0(), left.get1() + right.get0())
        self.left = left
        self.right = right

    def calc0(self):
        return min(self.left.get0(), self.left.get1() + self.right.get0())

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __str__(self):
        return f"({self.left} & {self.right})"

class OrNode(Node):
    def __init__(self, left, right):
        super().__init__(left.get0() + right.get0(), min(left.get1(), left.get0() + right.get1()))
        self.left = left
        self.right = right

    def calc0(self):
        return self.left.get0() + self.right.get0()

    def calc1(self):
        return min(self.left.get1(), self.left.get0() + self.right.get1())

    def __str__(self):
        return f"({self.left} | {self.right})"

class Parser:
    def __init__(self, text):
        self.text = text + "$"
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
        raise ValueError(f"Invalid character: {c}")

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

if __name__ == "__main__":
    parser = Parser("?&?|?&?|?&?")
    node = parser.get_formula()
    print(node.get0(), node.get1())