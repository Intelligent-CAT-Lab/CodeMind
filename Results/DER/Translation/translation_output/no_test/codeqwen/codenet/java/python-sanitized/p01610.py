import sys

class p01610:
    def run(self):
        self.line = sys.stdin.readline().strip()
        self.solve()

    def solve(self):
        self.is_ = [i // 4 for i in range(24)]
        # self.debug(self.is_)
        for c in self.line:
            self.rotate(c)
        # self.debug(self.is_)
        tab = [[-1, -1, 0, 1, -1, -1, -1, -1],
              [-1, -1, 3, 2, -1, -1, -1, -1], [4, 5, 8, 9, 12, 13, 16, 17],
              [7, 6, 11, 10, 15, 14, 19, 18],
              [-1, -1, 20, 21, -1, -1, -1, -1],
              [-1, -1, 23, 22, -1, -1, -1, -1],]
        for j in range(len(tab)):
            for i in range(len(tab[j])):
                if tab[j][i] == -1:
                    print(".", end="")
                else:
                    print("rgybwo"[self.is_[tab[j][i]]], end="")
            print()

    def rotate(self, c):
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

    def up(self):
        self.swap(0, 1, 2, 3)
        self.swap(4, 16, 12, 8)
        self.