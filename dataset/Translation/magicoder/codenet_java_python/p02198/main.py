import sys

class p02198:
    def __init__(self):
        self.systemin = sys.stdin

    def main(self):
        N, M = map(int, self.systemin.readline().split())
        print(N * M)

if __name__ == "__main__":
    instance = p02198()
    instance.main()