import sys

scanner = iter(sys.stdin.readline, '')

def gs():
    return next(scanner)

def gi():
    return int(next(scanner))

def gl():
    return long(next(scanner))

def gd():
    return float(next(scanner))

def main():
    s = gs().strip()
    print((len(s) - s.count('o'))*100 + 700)

if __name__ == "__main__":
    main()