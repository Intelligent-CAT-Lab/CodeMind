import sys
import math

so = sys.stdout
sc = sys.stdin

def main():
    N = ni()
    
    count = 0
    for i in range(6, 55555, 5):
        if is_prime(i):
            so.write(str(i) + " ")
            count += 1
        if count == N:
            break

def is_prime(n):
    for i in range(2, math.isqrt(n) + 1):
        if n % i == 0:
            return False
    return True

def ni():
    return int(sc.readline())

def nl():
    return long(sc.readline())

def nsToChars():
    return list(sc.readline().strip())

if __name__ == "__main__":
    main()