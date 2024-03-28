import sys

def count(pnum):
    result = 0
    for i in range(0, int(math.log(pnum, 2)) + 1):
        result = 2 ** i
    return result

def main():
    pnum = int(sys.stdin.readline())
    print(count(pnum))

if __name__ == '__main__':
    main()