```python
P = 1_000_000_007

class p03571:
    def __init__(self):
        self.a, self.b, self.c, self.d = map(int, input().split())
        print(self.fast())

    def count(self, a, b, c, d):
        return max(min(b, d) - max(a, c) + 1, 0)

    def fast(self):
        lst = []
        for coord in range(self.d + 2):
            self.checkX(coord, lst, True)
            self.checkY(coord, lst, True)
            self.checkZ(coord, lst, True)
            self.checkX(self.a - 1 - self.d + coord, lst, True)
            self.checkY(self.b - 1 - self.d + coord, lst, True)
            self.checkZ(self.c - 1 - self.d + coord, lst, True)

        ret = 0

        lst.append([0, self.count(0, 0, 0)])
        lst.append([self.a + self.b + self.c - 2, 0])

        lst.sort()
        for i in range(len(lst) - 1):
            what = lst[i][1]
            length = lst[i + 1][0] - lst[i][0]
            if what < 0:
                what += P
            ret += length * what % P
            if ret >= P:
                ret -= P

        return ret

    def countX(self, x, y, z):
        return (self.count(x - self.d + 1, x + self.d, 0, self.a - 1)
			* self.count(y - self.d, y + self.d, 0, self.b - 1) % P
			* self.count(z - self.d, z + self.d, 0, self.c - 1) % P)

    def countY(self, x, y, z):
        return (self.count(x - self.d, x + self.d, 0, self.a - 1)
			* self.count(y - self.d + 1, y + self.d, 0, self.b - 1) % P
			* self.count(z - self.d, z + self.d, 0, self.c - 1) % P)

    def countZ(self, x, y, z):
        return (self.count(x - self.d, x + self.d, 0, self.a - 1)
			* self.count(y - self.d, y + self.d, 0, self.b - 1) % P
			* self.count(z - self.d + 1, z + self.d, 0, self.c - 1) % P)

    def checkX(self, x, lst, rec):
        if x >= 0 and x < self.a - 1:
            y = (x + 1) * self.b // self.a
            z = (x + 1) * self.c // self.a
            lst.append([1 + x + y + z, self.count(x + 1, y, z) - self.countX(x, y, z)])
            if rec:
                self.checkY(y, lst, False)
                self.checkZ(z, lst, False)

    def checkY(self, y, lst, rec):
        if y >= 0 and y < self.b - 1:
            x = (y + 1) * self.a // self.b
            z = (y + 1) * self.c // self.b
            lst.append([1 + y + x + z, self.count(x, y + 1, z) - self.countY(x, y, z)])
            if rec:
                self.checkX(x, lst, False)
                self.checkZ(z, lst, False)

    def checkZ(self, z, lst, rec):
        if z >= 0 and z < self.c - 1:
            x = (z + 1) * self.a // self.c
            y = (z + 1) * self.b // self.c
            lst.append([1 + z + x + y, self.count(x, y, z + 1) - self.countZ(x, y, z)])

            if rec:
                self.checkX(x, lst, False)
                self.checkY(y, lst, False)

p = p03571()
```

