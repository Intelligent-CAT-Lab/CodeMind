import java.util.Scanner;

class Node:
    def __init__(self, cost0, cost1):
        self.cost0 = cost0
        self.cost1 = cost1

    def get0(self):
        return self.cost0

    def get1(self):
        return self.cost1

    def __str__(self):
        return str(self.cost0) + " " + str(self.cost1)

class VarNode(Node):
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
        return self.left.get0() + self.right.get0()

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __str__(self):
        return "(" + str(self.left) + "&" + str(self.right) + ")"

class OrNode(Node):
    def __init__(self, left, right):
        super().__init__(left.get0() + right.get0(), left.get1() + right.get1())
        self.left = left
        self.right = right

    def calc0(self):
        return self.left.get0() + self.right.get0()

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __str__(self):
        return "(" + str(self.left) + "|" + str(self.right) + ")"

class Parser:
    def __init__(self, text):
        self.text = text
        self.cur = 0

    def getTerm(self):
        c = self.text[self.cur]
        if c == '?':
            self.cur += 1
            return VarNode()
        if c == '(':
            self.cur += 1
            node = self.getOrExpr()
            assert self.text[self.cur] == ')'
            self.cur += 1
            return node
        raise Exception

    def getAndExpr(self):
        node = self.getTerm()
        while self.text[self.cur] == '&':
            self.cur += 1
            node = AndNode(node, self.getTerm())
        return node

    def getOrExpr(self):
        node = self.getAndExpr()
        while self.text[self.cur] == '|':
            self.cur += 1
            node = OrNode(node, self.getAndExpr())
        return node

    def getFormula(self):
        return self.getOrExpr()

def main():
    sc = Scanner(System.in)
    s = sc.nextLine()
    parser = Parser(s)
    node = parser.getFormula()
    print(node.get0() + " " + node.get1())

if __name__ == '__main__':
    main()