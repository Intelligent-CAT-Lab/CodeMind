import sys

def main():
    N, M, K = map(int, input().split())
    
    for i in range(N + 1):
        for j in range(M + 1):
            sum = M * i + N * j - (i * j * 2)
            if sum == K:
                print("Yes")
                return
    print("No")

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def __str__(self):
        return "{{{}, {}}}".format(self.key, self.value)

    def __lt__(self, other):
        return (self.value / self.key) < (other.value / other.key)

    def __gt__(self, other):
        return (self.value / self.key) > (other.value / other.key)

    def __eq__(self, other):
        return (self.value / self.key) == (other.value / other.key)

def debug(*args):
    if is_debug:
        print(*args, file=sys.stderr)

is_debug = 'sun.desktop' in sys.environ

if __name__ == '__main__':
    main()