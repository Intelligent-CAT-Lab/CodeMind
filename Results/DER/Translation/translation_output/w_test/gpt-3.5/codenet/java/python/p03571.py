```python
class P03571:
    P = 1000000007

    def count(self, a, b, c, d):
        return max(min(b, d) - max(a, c) + 1, 0)

    def count_xyz(self, x, y, z):
        return (self.count(x - self.d, x + self.d, 0, self.a - 1) *
                self.count(y - self.d, y + self.d, 0, self.b - 1) % self.P *
                self.count(z - self.d, z + self.d, 0, self.c - 1) % self.P)

    def count_x(self, x, y, z):
        return (self.count(x - self.d + 1, x + self.d, 0, self.a - 1) *
                self.count(y - self.d, y + self.d, 0, self.b - 1) % self.P *
                self.count(z - self.d, z + self.d, 0, self.c - 1) % self.P)

    def count_y(self, x, y, z):
        return (self.count(x - self.d, x + self.d, 0, self.a - 1) *
                self.count(y - self.d + 1, y + self.d, 0, self.b - 1) % self.P *
                self.count(z - self.d, z + self.d, 0, self.c - 1) % self.P)

    def count_z(self, x, y, z):
        return (self.count(x - self.d, x + self.d, 0, self.a - 1) *
                self.count(y - self.d, y + self.d, 0, self.b - 1) % self.P *
                self.count(z - self.d + 1, z + self.d, 0, self.c - 1) % self.P)

    def fast(self):
        lst = []
        for coord in range(self.d + 1):
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
                what += self.P
            ret += (length * what) % self.P
            if ret >= self.P:
                ret -= self.P
        
        return ret

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
                ret += self.P

            ret += self.count(x, y, z)
            if ret >= self.P:
                ret -= self.P
        
        return ret

    def __init__(self):
        self.a, self.b, self.c, self.d = map(int, input().split())
        print(self.fast())

P03571()
```
```
