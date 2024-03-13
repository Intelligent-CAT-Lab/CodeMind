import sys

class p00400:
    def __init__(self):
        self.systemin = sys.stdin
        self.log = sys.stdout
        self.result = sys.stdout

    def main(self):
        N = int(self.systemin.readline())
        r = 0
        if 'A' <= chr(N) <= 'Z':
            r = 1
        elif 'a' <= chr(N) <= 'z':
            r = 2
        self.result.write(str(r) + '\n')


instance = p00400()
instance.main()