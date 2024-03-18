class Block:
    def __init__(self, d):
        if d % 2 == 0:
            self.w = d
            self.h = d - 1
            self.c = [[False] * self.w for _ in range(self.h)]
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
            self.c = [[False] * self.w for _ in range(self.h)]
            c = (d - 1) >> 1
            for i in range(self.h):
                for j in range(self.w):
                    if abs(c - j) + abs(c - i) < (d + 1) // 2:
                        self.c[i][j] = True

            self.dx = (d + 1) >> 1
            self.dy = (d - 1) >> 1
            self.offx = self.dy
            self.offy = self.dx

    def dump(self):
        for i in range(self.h):
            s = ""
            for j in range(self.w):
                s += "*" if self.c[i][j] else " "
            print(s)


class Field:
    def __init__(self, w, h):
        self.w = w
        self.h = h
        self.c = [[0] * w for _ in range(h)]

    def put(self, block, x, y, color):
        for i in range(block.h):
            for j in range(block.w):
                px = j + x
                py = i + y
                if not (0 <= px < self.w and 0 <= py < self.h):
                    continue
                if not block.c[i][j]:
                    continue
                if self.c[py][px] != 0:
                    raise ValueError("Error")
                self.c[py][px] = color

    def dump(self):
        ng = False
        for i in range(self.h):
            s = ""
            for j in range(self.w):
                s += "RGBY"[self.c[i][j] - 1]
                if self.c[i][j] == 0:
                    ng = True
            print(s)
        if ng:
            raise ValueError("Error")


def solve(h, w, d):
    block = Block(d)
    field = Field(w, h)

    x1 = -block.w
    x2 = w
    y1 = -block.h - w
    y2 = h

    sy = y1
    sx = x1
    line = 0

    while sy < h:
        cnt = 0
        x = sx
        y = sy
        while x <= x2 and y <= y2:
            field.put(block, x, y, 1 + cnt % 2 + line % 2 * 2)
            x += block.dx
            y += block.dy
            cnt += 1

        sx -= block.offx
        sy += block.offy
        line += 1

    field.dump()


# Test case from the provided example:
if __name__ == '__main__':
    solve(2, 2, 1)