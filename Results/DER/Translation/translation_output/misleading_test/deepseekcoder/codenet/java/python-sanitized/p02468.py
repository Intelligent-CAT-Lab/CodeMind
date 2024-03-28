import sys

class InputReader:
    def __init__(self):
        self.input = sys.stdin.readline

    def read_int(self):
        return int(self.input())

    def read_ints(self):
        return list(map(int, self.input().split()))


def power(a, e, modP):
    ret = 1
    for _ in range(e):
        ret = (ret * a) % modP
    return ret


def main():
    reader = InputReader()
    m, n = reader.read_ints()
    print(power(m, n, 1000000007))


if __name__ == "__main__":
    main()