import sys

class Cube:
    def __init__(self):
        self.is = [i // 4 for i in range(24)]

    def up(self):
        self.swap(0, 1, 2, 3)
        self.swap(4, 16, 12, 8)
        self.swap(5, 17, 13, 9)

    def front(self):
        self.swap(8, 9, 10, 11)
        self.swap(2, 15, 20, 5)
        self.swap(3, 12, 21, 6)

    def right(self):
        self.swap(12, 13, 14, 15)
        self.swap(2, 16, 22, 10)
        self.swap(1, 19, 21, 9)

    def down(self):
        self.swap(20, 21, 22, 23)
        self.swap(11, 15, 19, 7)
        self.swap(10, 14, 18, 6)

    def back(self):
        self.swap(16, 17, 18, 19)
        self.swap(13, 0, 7, 22)
        self.swap(14, 1, 4, 23)

    def left(self):
        self.swap(4, 5, 6, 7)
        self.swap(0, 8, 20, 18)
        self.swap(3, 11, 23, 17)

    def swap(self, a, b, c, d):
        t = self.is[d]
        self.is[d] = self.is[c]
        self.is[c] = self.is[b]
        self.is[b] = self.is[a]
        self.is[a] = t

    def solve(self, line):
        for c in line:
            if c == 'U':
                self.up()
            elif c == 'F':
                self.front()
            elif c == 'R':
                self.right()
            elif c == 'D':
                self.down()
            elif c == 'B':
                self.back()
            elif c == 'L':
                self.left()

        tab = [[-1, -1, 0, 1, -1, -1, -1, -1],
               [-1, -1, 3, 2, -1, -1, -1, -1], [4, 5, 8, 9, 12, 13, 16, 17],
               [7, 6, 11, 10, 15, 14, 19, 18],
               [-1, -1, 20, 21, -1, -1, -1, -1],
               [-1, -1, 23, 22, -1, -1, -1, -1]]

        for j in range(len(tab)):
            for i in range(len(