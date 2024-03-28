import sys

def main():
    # Read input
    line = sys.stdin.readline()
    st = StringTokenizer(line)

    # Initialize sides and total
    sides = []
    total = 0
    for i in range(4):
        sides.append(int(st.nextToken()))
        total += sides[i]

    # Sort sides
    sides.sort()

    # Check if all sides are equal
    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == "__main__":
    main()