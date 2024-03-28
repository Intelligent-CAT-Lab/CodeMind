import sys

def count(pnum):
    result = 0
    for i in range(0, int(math.log(pnum, 2)) + 1):
        result = int(math.pow(2, i))
    return result

if __name__ == '__main__':
    pnum = int(sys.stdin.readline().strip())
    print(count(pnum))