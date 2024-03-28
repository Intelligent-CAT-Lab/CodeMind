import sys

class P02198:
    def main(self):
        N, M = map(int, input().split())
        print(N * M)
        return False

    def __init__(self):
        self.systemin = sys.stdin
        self.log = open(os.devnull, 'w')

def main():
    instance = P02198()
    instance.main()

if __name__ == "__main__":
    main()