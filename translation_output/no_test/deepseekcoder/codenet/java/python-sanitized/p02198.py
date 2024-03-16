import sys

class p02198:

    def __init__(self):
        self.systemin = sys.stdin
        self.log = open('log.txt', 'w')
        self.result = sys.stdout

    def main(self):
        N, M = map(int, self.systemin.readline().split())
        self.result.write(str(N * M) + '\n')
        self.systemin.close()
        self.log.close()

if __name__ == "__main__":
    p02198().main()