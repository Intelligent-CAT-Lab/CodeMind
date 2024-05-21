import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class Block:
    def __init__(self, d):
        if d % 2 == 0:
            self.w = d
            self.h = d - 1
            self.c = [[False] * self.w for _ in range(self.h)]
            cx1 = d // 2 - 1
            cx2 = d // 2
            cy = d // 2 - 1
            for i in range(self.h):
                for j in range(self.w):
                    if abs(cx1 - j) + abs(cy - i) < d // 2:
                        self.c[i][j] = True
                    if abs(cx2 - j) + abs(cy - i) < d // 2:
                        self.c[i][j] = True
        else:
            self.w = d
            self.h = d
            self.c = [[False] * self.w for _ in range(self.h)]
            c = d - 1 >> 1
            for i in range(self.h):
                for j in range(self.w):
                    if abs(c - j) + abs(c - i) < (d + 1) // 2:
                        self.c[i][j] = True

    def dump(self):
        for i in range(self.h):
            s = ""
            for j in range(self.w):
                s += "RGBY".charAt(self.c[i][j] - 1)
            print(s)

class Field:
    def __init__(self, w, h):
        self.w = w
        self.h = h
        self.c = [[0] * w for _ in range(h)]

    def put(self, b, x, y, color):
        for i in range(b.h):
            for j in range(b.w):
                px = j + x
                py = i + y
                if px < 0 or py < 0 or px >= self.w or py >= self.h:
                    continue
                if not b.c[i][j]:
                    continue
                if self.c[py][px]!= 0:
                    raise Error("ã¯ï¼")
                self.c[py][px] = color

    def dump(self):
        ng = False
        for i in range(self.h):
            s = ""
            for j in range(self.w):
                s += "RGBY".charAt(self.c[i][j] - 1)
                if self.c[i][j] == 0:
                    ng = True
            print(s)
        if ng:
            raise Error("ã¯ï¼")

def solve():
    h = int(input())
    w = int(input())
    d = int(input())

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

if __name__ == "__main__":
    solve()