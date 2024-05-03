import sys

def count(pnum):
    result = 0
    for i in range(31):
        if (2 ** i) <= pnum:
            result = 2 ** i
    return result

def run():
    pnum = int(sys.stdin.readline().strip())
    print(count(pnum))

if __name__ == "__main__":
    run()