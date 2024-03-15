import sys

class Reader:
    def __init__(self, file_like=sys.stdin.buffer):
        self.file_like = file_like
        self.buffer = []

    def next_int(self):
        while not self.buffer:
            self.buffer += self.file_like.readline().strip().split()
        return int(self.buffer.pop(0))

def main():
    sc = Reader()
    a = sc.next_int()
    b = sc.next_int()
    c = sc.next_int()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60*i+c) % d <= a:
            e = i
            break

    if e == -1:
        print(-1)
    else:
        print(60*e+c)

    sys.stdout.flush()

if __name__ == "__main__":
    main()