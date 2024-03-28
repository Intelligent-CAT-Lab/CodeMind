import sys

def gs():
    return sys.stdin.readline().strip()

def gi():
    return int(sys.stdin.readline().strip())

def gl():
    return long(sys.stdin.readline().strip())

def gd():
    return float(sys.stdin.readline().strip())

def main():
    s = gs()
    print((len(s) - s.count('o'))*100 + 700)

if __name__ == "__main__":
    main()