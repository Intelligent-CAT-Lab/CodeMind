import sys

def main():
    input_str = sys.stdin.readline().strip()
    sides = list(map(int, input_str.split()))
    total = sum(sides)
    sides.sort()
    if sides[0] == sides[1] and sides[2] == sides[3]:
        print("yes")
    else:
        print("no")

if __name__ == '__main__':
    main()