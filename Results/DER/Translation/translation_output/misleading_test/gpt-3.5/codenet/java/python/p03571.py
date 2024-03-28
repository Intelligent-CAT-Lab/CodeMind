```python
MOD = 1000000007

class p03571:
    def __init__(self, a, b, c, d):
        self.a = a
        self.b = b
        self.c = c
        self.d = d

    def count(self, a, b, c, d):
        return max(min(b, d) - max(a, c) + 1, 0)

    def count_abcd(self, x, y, z):
        return (self.count(x - self.d, x + self.d, 0, self.a - 1) *
                self.count(y - self.d, y + self.d, 0, self.b - 1) %
                MOD *
                self.count(z - self.d, z + self.d, 0, self.c - 1) %
                MOD)

    def count_x(self, x, y, z):
        return (self.count(x - self.d + 1, x + self.d, 0, self.a - 1) *
                self.count(y - self.d, y + self.d, 0, self.b - 1) %
                MOD *
                self.count(z - self.d, z + self.d, 0, self.c - 1) %
                MOD)

    def count_y(self, x, y, z):
        return (self.count(x - self.d, x + self.d, 0, self.a - 1) *
                self.count(y - self.d + 1, y + self.d, 0, self.b - 1) %
                MOD *
                self.count(z - self.d, z + self.d, 0, self.c - 1) %
                MOD)

    def count_z(self, x, y, z):
        return (self.count(x - self.d, x + self.d, 0, self.a - 1) *
                self.count(y - self.d, y + self.d, 0, self.b - 1) %
                MOD *
                self.count(z - self.d + 1, z + self.d, 0, self.c - 1) %
                MOD)

    def fast(self):
        lst = []
        for coord in range(self.d + 2):
            self.check_x(coord, lst, True)
            self.check_y(coord, lst, True)
            self.check_z(coord, lst, True)
            self.check_x(self.a - 1 - self.d + coord, lst, True)
            self.check_y(self.b - 1 - self.d + coord, lst, True)
            self.check_z(self.c - 1 - self.d + coord, lst, True)

        ret = 0
        lst.append((0, self.count(0, 0, 0)))
        lst.append((self.a + self.b + self.c - 2, 0))

        lst.sort()
        for i in range(len(lst) - 1):
            what = lst[i][1]
            length = lst[i + 1][0] - lst[i][0]
            if what < 0:
                what += MOD
            ret += (length * what) % MOD
            if ret >= MOD:
                ret -= MOD

        return ret

    def check_x(self, x, lst, rec):
        if x >= 0 and x < self.a - 1:
            y = x * self.b // self.a
            z = x * self.c // self.a
            lst.append((1 + x + y + z, self.count_abcd(x + 1, y, z) - self.count_x(x, y, z)))
            if rec:
                self.check_y(y, lst, False)
                self.check_z(z, lst, False)

    def check_y(self, y, lst, rec):
        if y >= 0 and y < self.b - 1:
            x = y * self.a // self.b
            z = y * self.c // self.b
            lst.append((1 + y + x + z, self.count_abcd(x, y + 1, z) - self.count_y(x, y, z)))
            if rec:
                self.check_x(x, lst, False)
                self.check_z(z, lst, False)

    def check_z(self, z, lst, rec):
        if z >= 0 and z < self.c - 1:
            x = z * self.a // self.c
            y = z * self.b // self.c
            lst.append((1 + z + x + y, self.count_abcd(x, y, z + 1) - self.count_z(x, y, z)))
            if rec:
                self.check_x(x, lst, False)
                self.check_y(y, lst, False)

    def slow(self):
        left_x = self.b * self.c
        left_y = self.c * self.a
        left_z = self.a * self.b

        x, y, z = 0, 0, 0
        ret = self.count(0, 0, 0)

        while x != self.a - 1 or y != self.b - 1 or z != self.c - 1:
            if left_x < left_y and left_x < left_z:
                ret -= self.count_x(x, y, z)
                left_y -= left_x
                left_z -= left_x
                left_x = self.b * self.c
                x += 1
            elif left_y < left_z:
                ret -= self.count_y(x, y, z)
                left_x -= left_y
                left_z -= left_y
                left_y = self.a * self.c
                y += 1
            else:
                ret -= self.count_z(x, y, z)
                left_x -= left_z
                left_y -= left_z
                left_z = self.a * self.b
                z += 1

            if ret < 0:
                ret += MOD

            ret += self.count(x, y, z)
            if ret >= MOD:
                ret -= MOD

        return ret

a, b, c, d = map(int, input().split())
obj = p03571(a, b, c, d)
print(obj.fast())
```
```
