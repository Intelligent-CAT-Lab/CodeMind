import sys

class FastScanner:
    
    def __init__(self):
        self._buffer = []

    def next(self):
        while not self._buffer:
            self._buffer = input().split()
        return self._buffer.pop(0)

    def next_line(self):
        return input()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())  # In Python, there's no practical limit to the size of an integer.

    def next_int_array(self, n):
        arr = []
        for _ in range(n):
            arr.append(self.next_int())
        return arr

    def next_long_array(self, n):
        arr = []
        for _ in range(n):
            arr.append(self.next_long())
        return arr

def solve(fs):
    a = fs.next_int()
    b = fs.next_int()
    c = fs.next_int()

    if a == b and b == c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    fs = FastScanner()
    solve(fs)