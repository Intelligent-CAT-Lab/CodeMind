class Scanner:
    def __init__(self, inp):
        self.inp = inp

    def next_int(self):
        return int(self.inp.readline())

    def next_line(self):
        return self.inp.readline().strip()

    def next_ints(self, n):
        return [int(x) for x in self.inp.readline().split()]

    def next_longs(self, n):
        return [long(x) for x in self.inp.readline().split()]


def solve(N, M, K):
    for i in range(N+1):
        for j in range(M+1):
            sum = M * i + N * j - (i * j * 2)
            if sum == K:
                return "Yes"
    return "No"


if __name__ == "__main__":
    scanner = Scanner(sys.stdin)
    N, M, K = scanner.next_ints(3)
    print(solve(N, M, K))