import sys

class p03534:
    def __init__(self):
        self.abc = [0, 0, 0]

    def main(self, sc):
        str = sc.next()
        for i in range(len(str)):
            for j in range(3):
                if str[i] == "abc"[j]:
                    self.abc[j] += 1

        self.abc.sort()

        print("YES" if (self.abc[1] - self.abc[0] < 2) and (self.abc[2] - self.abc[0] < 2) else "NO")

if __name__ == "__main__":
    sc = sys.stdin
    p03534().main(sc)
    sc.close()