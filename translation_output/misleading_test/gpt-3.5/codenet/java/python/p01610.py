```python
class P01610:
    def __init__(self):
        self.is_list = []
        self.line = ""
        self.tab = [[-1, -1, 0, 1, -1, -1, -1, -1],
                    [-1, -1, 3, 2, -1, -1, -1, -1], [4, 5, 8, 9, 12, 13, 16, 17],
                    [7, 6, 11, 10, 15, 14, 19, 18],
                    [-1, -1, 20, 21, -1, -1, -1, -1],
                    [-1, -1, 23, 22, -1, -1, -1, -1]]

    def run(self):
        self.line = input()
        self.solve()

    def solve(self):
        self.is_list = [i // 4 for i in range(24)]
        for c in self.line:
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

        for j in range(len(self.tab)):
            for i in range(len(self.tab[j])):
                if self.tab[j][i] == -1:
                    print(".")
                else:
                    print("rgybwo"[self.is_list[self.tab[j][i]])
            print("")

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
        t = self.is_list[d]
        self.is_list[d] = self.is_list[c]
        self.is_list[c] = self.is_list[b]
        self.is_list[b] = self.is_list[a]
        self.is_list[a] = t

p = P01610()
p.run()
```
```
