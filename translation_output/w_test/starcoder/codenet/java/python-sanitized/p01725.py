import sys

class p01725:
    def __init__(self):
        self.PRI = [
            [1, 2, 3],
            [1, 3, 2],
            [2, 1, 3],
            [2, 3, 1],
            [3, 1, 2],
            [3, 2, 1],
            #
            [1, 1, 2],
            [1, 2, 1],
            [2, 1, 1],
            #
            [2, 2, 1],
            [2, 1, 2],
            [1, 2, 2],
            #
            [2, 2, 2],
        ]

    def main(self):
        line = sys.stdin.readline()
        words = line.split("(?<!\\d)|(?!\\d)")
        expr = []

        for word in words:
            c = word[0]
            if c == '(':
                expr.append(self.Lp())
            elif c == ')':
                expr.append(self.Rp())
            elif c == '+':
                expr.append(self.Add())
            elif c == '-':
                expr.append(self.Subtract())
            elif c == '*':
                expr.append(self.Multiply())
            else:
                expr.append(self.Num(int(word)))

        max = -sys.maxsize
        for pri in self.PRI:
            max = max(max, self.eval(self.postfix(expr, pri)))
        print(max)

    def postfix