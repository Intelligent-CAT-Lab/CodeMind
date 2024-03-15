import sys

def main():
    br = sys.stdin
    line = br.readline()
    st = StringTokenizer(line)
    sides = [int(token) for token in st]
    total = sum(sides)
    sides.sort()
    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()