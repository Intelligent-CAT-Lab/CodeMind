import sys

class atcoder_ABC158_B:
    def __init__(self):
        self.N = 0
        self.A = 0
        self.B = 0

    def run(self):
        self.N = int(sys.stdin.readline().strip())
        self.A = int(sys.stdin.readline().strip())
        self.B = int(sys.stdin.readline().strip())
        base = self.N // (self.A + self.B)
        mod = self.N % (self.A + self.B)
        if mod >= self.A:
            mod = self.A
        print(base * self.A + mod)
        return

if __name__ == "__main__":
    atcoder_ABC158_B().run()