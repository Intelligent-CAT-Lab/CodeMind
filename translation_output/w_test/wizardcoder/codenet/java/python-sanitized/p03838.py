import sys

class p03838:
    def __init__(self):
        self.x = 0
        self.y = 0

    def solve(self):
        self.x = int(self.next_int())
        self.y = int(self.next_int())

        if self.x >= 0:
            if self.y >= 0:
                if self.x > self.y:
                    if self.y == 0:
                        print(self.x-self.y+1)
                    else:
                        print(self.x-self.y+2)
                else:
                    print(self.y-self.x)
            else:
                print(abs(abs(self.y)-self.x)+1)
        else:
            if self.y >= 0:
                if self.y == 0:
                    print(abs(abs(self.x)-self.y))
                else:
                    print(abs(abs(self.x)-self.y)+1)
            else:
                if self.x > self.y:
                    print(self.x-self.y+2)
                else:
                    print(self.y-self.x)

    def next_int(self):
        return int(self.next())

    def next(self):
        return sys.stdin.readline().strip()

if __name__ == '__main__':
    p03838().solve()