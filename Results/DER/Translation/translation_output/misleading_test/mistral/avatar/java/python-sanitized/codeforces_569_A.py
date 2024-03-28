import sys

def solve(t, s, q):
    sum = 0
    while s < t:
        s = s * q
        sum += 1
    return sum

def main():
    t = int(input())
    s = int(input())
    q = int(input())
    sum = solve(t, s, q)
    print(sum)

if __name__ == "__main__":
    main()