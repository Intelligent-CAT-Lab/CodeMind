Here's the equivalent Python code for the provided Java code:

```python
# Python 3
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


def main():
    s = input()
    parser = Parser(s)
    node = parser.get_formula()
    print(node.get0(), node.get1())


if __name__ == "__main__":
    main()
```

This translation includes equivalent Python classes and methods for the Java code, including the abstraction of the `Node` class, the parsing mechanism inside the `Parser` class, and the node types `VarNode`, `AndNode`, and `OrNode`.

Some points to note:
- In Python, the `assert` keyword is used for debugging purposes and will raise an `AssertionError` if the condition is not met.
- Additionally, the `__str__` method is the Python equivalent of Java's `toString()` method, used to return a string representation of the object.
- Error handling was changed from `IllegalStateException` to `ValueError` as Python does not have a direct equivalent of `IllegalStateException`.
- The `main` function and the conditional `__name__ == "__main__"` statement are used to execute the entry point of the script.
