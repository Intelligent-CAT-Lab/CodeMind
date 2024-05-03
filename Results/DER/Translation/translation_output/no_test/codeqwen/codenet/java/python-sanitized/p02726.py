import sys

class Scanner:
    def __init__(self, inp):
        self.inp = inp
        self.st = None

    def next(self):
        while self.st is None or not self.st.strip():
            self.st = self.inp.readline().strip()
        return self.st.split()[0]

    def next_line(self):
        return self.inp.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def in_arr(self, n):
        return [int(x) for x in self.next_line().split()]

def main():
    sc = Scanner(sys.stdin)
    out = sys.stdout

    n = sc.next_int()
    x = sc.next_int() - 1
    y = sc.next_int() - 1

    edges = [0] * n
    for i in range(n):
        for j in range(i+1, n):
            edge = min(j-i, min(abs(x-i)+abs(j-y), abs(y-i)+abs(j-x))+1)
            edges[edge] += 1

    for i in range(1, n):
        out.write(str(edges[i]) + "\n")

    out.close()

if __name__ == "__main__":
    main()