import sys

class Scanner:
    def __init__(self, stream):
        self.stream = stream

    def nextInt(self):
        return int(self.stream.readline().strip())

def main():
    in_ = Scanner(sys.stdin)
    n = in_.nextInt()
    codeforces_189_A = [in_.nextInt() for _ in range(3)]
    codeforces_189_A.sort()
    d = [-500] * (n + 1)
    d[0] = 0
    for i in range(n + 1):
        for j in range(3):
            if i - codeforces_189_A[j] >= 0 and d[i - codeforces_189_A[j]]!= -500:
                d[i] = max(d[i], d[i - codeforces_189_A[j]] + 1)
    print(d[n])

if __name__ == '__main__':
    main()