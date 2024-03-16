import sys

def count(pnum):
    result = 0
    for i in range(1, pnum+1):
        result |= 1 << i
    return result

def main():
    sys.stdout = sys.stdout.buffer
    out = sys.stdout
    sc = sys.stdin
    out.write(str(count(int(sc.readline()))))
    out.flush()
    sc.close()

if __name__ == '__main__':
    main()