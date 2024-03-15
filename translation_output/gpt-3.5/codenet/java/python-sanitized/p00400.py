import sys

class p00400:

    def __init__(self):
        self.systemin = sys.stdin
        self.log = None
        self.result = sys.stdout

    def main(self):
        N = int(input())
        r = 0
        if ord('A') <= N <= ord('Z'):
            r = 1
        elif ord('a') <= N <= ord('z'):
            r = 2
        print(r)

if __name__ == "__main__":
    instance = p00400()
    instance.main()