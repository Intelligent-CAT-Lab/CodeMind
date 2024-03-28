import sys

modP = 1000000007

def power(a, e, modP):
    ret = 1
    while e > 0:
        if e % 2 != 0:
            ret = (ret * a) % modP
        a = (a * a) % modP
        e //= 2
    return ret

def solve(m, n):
    return power(m, n, modP)

def main():
    input_data = sys.stdin.readline().split()
    m = int(input_data[0])
    n = int(input_data[1])
    print(solve(m, n))

if __name__ == "__main__":
    main()