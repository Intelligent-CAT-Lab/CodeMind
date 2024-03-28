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
        pass

    def calc1(self):
        pass

    def __str__(self):
        pass

class VarNode(Node):
    def __init__(self):
        super().__init__()

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
    def __init__(self, s):
        self.text = s + "$"
        self.cur = 0

    def getTerm(self):
        c = self.text[self.cur]
        if c == '?':
            self.cur += 1
            return VarNode()
        if c == '(':
            self.cur += 1
            node = self.getOrExpr()
            assert(self.text[self.cur] == ')')
            self.cur += 1
            return node
        raise Exception("Invalid character: " + c)

    def getAndExpr(self):
        node = self.getTerm()
        while self.text[self.cur] == '&':
            self.cur += 1
            r = self.getTerm()
            node = AndNode(node, r)
        return node

    def getOrExpr(self):
        node = self.getAndExpr()
        while self.text[self.cur] == '|':
            self.cur += 1
            r = self.getAndExpr()
            node = OrNode(node, r)
        return node

    def getFormula(self):
        return self.getOrExpr()

def main():
    s = input()
    parser = Parser(s)
    node = parser.getFormula()
    print(node.get0(), node.get1())

if __name__ == '__main__':
    main()