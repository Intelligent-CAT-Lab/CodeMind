import sys

class p02198:

    def __init__(self):
        self.systemin = sys.stdin
        self.log = sys.stdout

    def main(self):
        N, M = map(int, self.systemin.readline().split())
        print(N * M)
        return False

if __name__ == '__main__':
    instance = p02198()
    instance.main()
    instance.systemin.close()