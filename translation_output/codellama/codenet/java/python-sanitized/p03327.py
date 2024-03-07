import sys

class Hayami:
    def __init__(self):
        self.hayami = sys.stdin.readline().strip()
        self.hayami_len = len(self.hayami)
        self.hayami_idx = 0

    def hayami_saori(self):
        if self.hayami_idx < self.hayami_len:
            return self.hayami[self.hayami_idx]
        else:
            return -1

    def saori_hayami(self):
        if self.hayami_saori() < 1000:
            return "ABC"
        else:
            return "ABD"

    def close(self):
        sys.stdin.close()

if __name__ == "__main__":
    hayami = Hayami()
    print(hayami.saori_hayami())
    hayami.close()