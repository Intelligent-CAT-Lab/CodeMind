import sys

class Vec2i:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __eq__(self, other):
        if not isinstance(other, Vec2i):
            return NotImplemented
        return self.x == other.x and self.y == other.y

    def __hash__(self):
        return hash((self.x, self.y))

    def __lt__(self, other):
        return (self.x, self.y) < (other.x, other.y)

    def __repr__(self):
        return f"({self.x}, {self.y})"


class JConnectedCheckerboard:
    def solve(self, test_number):
        n = int(input())
        ans = set()
        for i in range(1, n, 2):
            ans.add(Vec2i(i, 0))
            ans.add(Vec2i(0, i))
        for i in range(n % 2, n, 2):
            ans.add(Vec2i(i, n - 1))
            ans.add(Vec2i(n - 1, i))
        offset = 0
        d = 2
        for _ in range(10):
            for i in range(1, n, d * 2):
                for j in range(offset, n, d * 2):
                    ans.add(Vec2i(i, j))
            for i in range(d + 1, n, d * 2):
                for j in range(offset + d, n, d * 2):
                    ans.add(Vec2i(i, j))
            offset += d
            d *= 2

        print(len(ans))
        for an in sorted(ans):
            print(an.x, an.y)


def main():
    JConnectedCheckerboard().solve(1)


if __name__ == "__main__":
    main()