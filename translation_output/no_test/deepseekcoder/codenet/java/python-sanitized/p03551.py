import sys

class p03551:

    def __init__(self):
        pass

    def run(self):

        n = int(sys.stdin.readline())
        m = int(sys.stdin.readline())

        base = n*100+m*1800

        print(base << m)


if __name__ == "__main__":
    m = p03551()
    m.run()