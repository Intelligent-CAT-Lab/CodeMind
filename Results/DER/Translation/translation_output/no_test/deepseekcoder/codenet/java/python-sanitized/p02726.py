import sys

def main():
    sc = Scanner(sys.stdin)
    n, x, y = sc.in_arr(3)
    x -= 1
    y -= 1
    edges = [0]*n
    for i in range(n):
        for j in range(i+1, n):
            edge = min(j-i, min(abs(x-i)+abs(j-y), abs(y-i)+abs(j-x))) + 1
            edges[edge] += 1
    for i in range(1, n):
        print(edges[i])

class Scanner:
    def __init__(self, inp):
        self.inp = inp
        self.st = None

    def next(self):
        while(self.st == None or len(self.st)==0):
            self.st = self.inp.readline().split()
        return self.st.pop(0)

    def next_int(self):
        return int(self.next())

    def in_arr(self, n):
        return [int(x) for x in self.inp.readline().split()[:n]]

if __name__ == "__main__":
    main()