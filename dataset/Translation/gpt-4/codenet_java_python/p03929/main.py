import sys

class p03929:
    @staticmethod
    def solve():
        one = p03929.next_int_array()
        N = one[0]
        d = one[1]
        if N <= 2:
            p03929.myout(0)
            return
        N -= 3
        loop = N // 11
        amari = N % 11
        map = [[1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5], [0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5], [1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5],
               [0, 0, 1, 1, 2, 3, 3, 4, 4, 4, 5], [1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5], [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 5],
               [0, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5], [1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5], [0, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5],
               [1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5], [0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5]]
        p03929.myout(loop * 5 + map[d][amari])

    @staticmethod
    def next():
        return next(p03929.ii)

    @staticmethod
    def next_int():
        return int(p03929.next())

    @staticmethod
    def next_int_array():
        return [int(i) for i in p03929.next().split()]

    @staticmethod
    def myout(t):
        sys.stdout.write(f"{t}\n")


# Don't have to see. start
class InputIterator:
    def __init__(self):
        self.input_lines = sys.stdin.readlines()
        self.index = 0

    def __iter__(self):
        return self

    def __next__(self):
        try:
            result = self.input_lines[self.index].strip()
            self.index += 1
            return result
        except IndexError:
            raise StopIteration

    def __has_next__(self):
        return self.index < len(self.input_lines)


p03929.ii = InputIterator()
# Don't have to see. end

if __name__ == "__main__":
    p03929.solve()