class Node:
    def __init__(self):
        self.cost0 = None
        self.cost1 = None

    def get0(self):
        if self.cost0 is not None:
            return self.cost0
        return self.calc0()

    def get1(self):
        if self.cost1 is not None:
            return self.cost1
        return self.calc1()

    def calc0(self):
        raise NotImplementedError

    def calc1(self):
        raise NotImplementedError

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
        return f"({self.left}&{self.right})"

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
        return f"({self.left}|{self.right})"

class Parser:
    def __init__(self, s):
        self.text = s + "$"
        self.cur = 0

    def get_term(self):
        c = self.text[self.cur]
        if c == '?':
            self.cur += 1
            return VarNode()
        if c == '(':
            self.cur += 1
            node = self.get_or_expr()
            assert self.text[self.cur] == ')'
            self.cur += 1
            return node
        raise ValueError("IllegalStateException")

    def get_and_expr(self):
        node = self.get_term()
        while self.text[self.cur] == '&':
            self.cur += 1
            r = self.get_term()
            node = AndNode(node, r)
        return node

    def get_or_expr(self):
        node = self.get_and_expr()
        while self.text[self.cur] == '|':
            self.cur += 1
            r = self.get_and_expr()
            node = OrNode(node, r)
        return node

    def get_formula(self):
        return self.get_or_expr()

# Read input from the user
input_str = input()
parser = Parser(input_str)
formula = parser.get_formula()
print(formula.get0(), formula.get1())