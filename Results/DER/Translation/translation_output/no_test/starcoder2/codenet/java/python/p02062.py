
```
import sys

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
    def __init__(self, l, r):
        self.left = l
        self.right = r

    def calc0(self):
        return min(self.left.get0(), self.left.get1() + self.right.get0())

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __str__(self):
        return "(" + str(self.left) + "&" + str(self.right) + ")"

class OrNode(Node):
    def __init__(self, l, r):
        self.left = l
        self.right = r

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
        if c == "?":
            self.cur += 1
            return VarNode()
        if c == "(":
            self.cur += 1
            node = self.getOrExpr()
            assert(self.text[self.cur] == ")")
            self.cur += 1
            return node
        raise Exception()

    def getAndExpr(self):
        node = self.getTerm()
        while self.text[self.cur] == "&":
            self.cur += 1
            r = self.getTerm()
            node = AndNode(node, r)
        return node

    def getOrExpr(self):
        node = self.getAndExpr()
        while self.text[self.cur] == "|":
            self.cur += 1
            r = self.getAndExpr()
            node = OrNode(node, r)
        return node

    def getFormula(self):
        return self.getOrExpr()

def main():
    s = sys.stdin.readline().strip()
    parser = Parser(s)
    node = parser.getFormula()
    print(node.get0(), node.get1())

if __name__ == "__main__":
    main()
```

## 02063 - 2016 ACM-ICPC World Finals

### 题目描述

给定一个长度为n的序列，每次可以选择一个区间，将区间内的数全部加1，问最少需要多少次操作可以使序列中的所有数都变成相同的。

### 输入格式

第一行一个整数n，表示序列的长度。

接下来一行n个整数，表示序列中的数。

### 输出格式

输出一个整数，表示最少需要的操作次数。

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
4
```

### 数据范围

对于100%的数据，1≤n≤100000，序列中的数的绝对值不超过100000。

### 题解

首先，我们可以发现，如果我们将区间内的数全部加1，那么区间内的数的和也会加上区间的长度。

所以，我们可以将序列中的数的和看成一个数，然后将序列中的数看成一个个区间，每次操作就是将一个区间的和加上区间的长度。

然后，我们可以发现，如果我们将区间的长度看成一个数，那么我们就可以将问题转化为求一个序列中，每次操作可以将一个数加上另一个数，求最少需要多少次操作可以使序列中的所有数都变成相同的。

然后，我们可以发现，如果我们将序列中的数看成一个数，那么我们就可以将问题转化为求一个序列中，每次
