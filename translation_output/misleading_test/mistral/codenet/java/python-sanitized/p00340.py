import sys

def main():
    line = sys.stdin.readline()
    st = StringTokenizer(line)
    sides = []
    total = 0
    for i in range(4):
        sides.append(int(st.nextToken()))
        total += sides[i]
    sides.sort()
    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()