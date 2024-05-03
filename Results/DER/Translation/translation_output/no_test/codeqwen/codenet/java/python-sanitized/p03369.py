import sys

def gs():
    return sys.stdin.readline().strip()

def gi():
    return int(sys.stdin.readline())

def gl():
    return float(sys.stdin.readline())

def gd():
    return float(sys.stdin.readline())

if __name__ == "__main__":
    s = gs()
    print((len(s) - s.count('o')) * 100 + 700)