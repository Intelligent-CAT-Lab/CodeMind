import math

class p03913:
    def __init__(self):
        pass

    @staticmethod
    def main():
        p = p03913()
        p.run()

    def run(self):
        n, a = map(int, input().split())
        self.solver(n, a)

    def solver(self, n, a):
        ans = n
        for m in range(2, 41):
            c = int(n ** (