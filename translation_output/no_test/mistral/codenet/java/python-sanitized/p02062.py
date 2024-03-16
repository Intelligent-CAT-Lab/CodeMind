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
        super().__init__()
        self.left = left
        self.right = right

    def calc0(self):
        return min(self.left.get0(), self.left.get1() + self.right.get0())

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __str__(self):
        return "(" + str(self.left) + "&" + str(self.right) + ")"

class OrNode(Node):
    def __init__(self, left, right):
        super().__init__()
        self.left = left
        self.right = right

    def calc0(self):
        return self.left.get0() + self.right.get0()

    def calc1(self):
        return min(self.left.get1(), self.left.get0() + self.right.get1())

    def __str__(self):
        return "(" + str(self.left) + "|" + str(self.right) + ")"

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
        raise ValueError()

    def get_and_expr(self):
        node = self.get_term()
        while self.text[self.cur] == "&":
            self.cur += 1
            node = AndNode(node, self.get_term())
        return node

    def get_or_expr(self):
        node = self.get_and_expr()
        while self.text[self.cur] == "|":
            self.cur += 1
            node = OrNode(node, self.get_and_expr())
        return node

    def get_formula(self):
        return self.get_or_expr()


if __name__ == "__main__":
    with open("input.txt", "r") as f:
        text = f.read()

    parser = Parser(text)
    node = parser.get_formula()
    print(node.get0(), node.get1())