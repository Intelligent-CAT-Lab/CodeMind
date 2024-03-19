import sys

def main():
    lines = sys.stdin.readline().split()
    list = [float(line) for line in lines]
    n = len(list)
    print(round(math.sqrt((list[0]-list[2])*(list[0]-list[2])+(list[1]-list[3])*(list[1]-list[3])), 6))

if __name__ == "__main__":
    main()