class main:
    import re
    
    class Node:
        def __init__(self, cost0=0, cost1=0):
            self.cost0 = cost0
            self.cost1 = cost1
    
        def calc0(self):
            return 1
    
        def calc1(self):
            return 1
    
        def __str__(self):
            return "?"
    
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
            return "(" + self.left.toString() + "&" + self.right.toString() + ")"
    
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
            return "(" + self.left.toString() + "|" + self.right.toString() + ")"
    
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
            raise IllegalStateException()
    
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
        text = "?&?|?&?|?"
        parser = Parser(text)
        node = parser.get_formula()
        print(node.get0(), node.get1())