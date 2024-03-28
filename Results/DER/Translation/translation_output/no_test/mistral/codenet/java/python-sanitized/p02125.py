import sys

def run():
    N = int(input())
    if N == 1:
        print(1)
        return
    c = 1
    while 2 * c - 1 <= N:
        c *= 2
    c -= 1
    with open(sys.stdout, 'w') as pw:
        pw.write(str(bitcount(c)))
        pw.close()

def bitcount(n):
    count = 0
    while n > 0:
        count += 1
        n >>= 1
    return count

if __name__ == '__main__':
    run()