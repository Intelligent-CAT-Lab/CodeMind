import sys

class p00400:

    def __init__(self):
        self.systemin = sys.stdin
        self.log = open('/dev/null', 'w')
        self.result = sys.stdout

    def main(self):
        N = ord(self.systemin.read(1))
        r = 0
        if 65 <= N <= 90:
            r = 1
        elif 97 <= N <= 122:
            r = 2
        self.result.write(str(r) + '\n')
        self.systemin.close()
        self.log.close()

if __name__ == "__main__":
    instance = p00400()
    instance.main()