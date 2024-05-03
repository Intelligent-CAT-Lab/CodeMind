class Block:
    def __init__(self, d):
        if d % 2 == 0:
            self.w = d
            self.h = d - 1
            self.c = [[False for _ in range(self.w)] for _ in range(self.h)]
            cy = d // 2 - 1
            cx1 = d // 2 - 1
            cx2 = d // 2
            for i in range(self.h):
                for j in range(self.w):
                    if abs(cx1 - j) + abs(cy - i) < d // 2:
                        self.c[i][j] = True
                    if abs(cx2 - j) + abs(cy - i) < d // 2:
                        self.c[i][j] = True

            self.dx = self.w
            self.dy = 0

            self.offx = d // 2
            self.offy = d // 2
        else:
            self.w = d
            self.h = d
            self.c = [[False for _ in range(self.w)] for _ in range(self.h)]
            c = d // 2
            for i in range(self.h):
                for j in range(self.w):
                    if abs(c - j) + abs(c - i) < (d + 1) // 2:
                        self.c[i][j] = True

            self.dx = (d + 1) // 2
            self.dy = d - 1 // 2

            self.offx = self.dy
            self.offy = self.dx

    def dump(self):
        for i in range(self.h):
            s = ""
            for j in range(self.w):
                if self.c[i][j]:
                    s += "*"
                else:
                    s += " "
            print(s)


class Field:
    def __init__(self, w, h):
        self.c = [[0