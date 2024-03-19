import sys

def count_ones(n):
    s = ""
    while n > 0:
        x = n % 2
        n = n // 2
        s += str(x) + " "
    ans = s.count('1')
    return ans

if __name__ == "__main__":
    n = int(sys.stdin.readline())
    print(count_ones(n))