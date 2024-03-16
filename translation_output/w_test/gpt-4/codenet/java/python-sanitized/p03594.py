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

    @staticmethod
    def abs(a):
        return -a if a < 0 else a

    def dump(self):
        for i in range(self.h):
            s = ''.join('*' if cell else ' ' for cell in self.c[i])
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
                    raise Exception("Error: Overlapping Block Placement")
                self.c[py][px] = color

    def dump(self):
        ng = False
        for i in range(self.h):
            s = ''.join("RGBY"[val - 1] if val else " " for val in self.c[i])
            print(s)
            ng |= any(val == 0 for val in self.c[i])
        if ng:
            raise Exception("Error: Missing Block")

def solve(h, w, d):
    b = Block(d)
    f = Field(w, h)

    x1 = -b.w
    x2 = w
    y1 = -b.h - w
    y2 = h

    sy = y1
    sx = x1
    line = 0

    while sy < h:
        cnt = 0
        x = sx
        y = sy
        while x <= x2 and y <= y2:
            f.put(b, x, y, 1 + cnt % 2 + line % 2 * 2)
            x += b.dx
            y += b.dy
            cnt += 1

        sx -= b.offx
        sy += b.offy
        line += 1

    f.dump()

# Test input (equivalent of main method)
if __name__ == "__main__":
    h, w, d = map(int, input().split())
    solve(h, w, d)