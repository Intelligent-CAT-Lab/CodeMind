import java.util
import java.io
import java.math

def solve():
    one = nextIntArray()
    N = one[0]
    d = one[1]
    if N <= 2:
        print(0)
        return
    N -= 3
    loop = N // 11
    amari = N % 11
    map = [[1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5], [0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5], [1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5],
        [0, 0, 1, 1, 2, 3, 3, 4, 4, 4, 5], [1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5], [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 5],
        [0, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5], [1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5], [0, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5],
        [1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5], [0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5]]
    print(loop * 5 + map[d][amari])

# Method addition frame start



# Method addition frame end

# Don't have to see. start------------------------------------------
class InputIterator:
    def __init__(self):
        self.inputLine = []
        self.index = 0
        self.max = 0
        with open("stdin.txt", "r") as f:
            for line in f:
                self.inputLine.append(line)
        self.max = len(self.inputLine)

    def hasNext(self):
        return self.index < self.max

    def next(self):
        if self.hasNext():
            return self.inputLine[self.index]
        else:
            raise IndexError("