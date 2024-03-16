import sys

class p03534:
    def __init__(self):
        self.abc = [0, 0, 0]

    def main(self):
        str = sys.stdin.readline().strip()
        for i in str:
            if i == 'a':
                self.abc[0] += 1
            elif i == 'b':
                self.abc[1] += 1
            elif i == 'c':
                self.abc[2] += 1

        self.abc.sort()

        print("YES" if (self.abc[1] - self.abc[0] < 2) and (self.abc[2] - self.abc[0] < 2) else "NO")

if __name__ == "__main__":
    p03534().main()