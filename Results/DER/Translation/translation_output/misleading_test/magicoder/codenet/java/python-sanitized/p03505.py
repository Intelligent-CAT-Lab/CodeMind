import sys

def help(K, A, B):
    if A <= B:
        return A >= K and 1 or -1
    if A >= K:
        return 1
    dif = A - B
    t = (K - A) // dif + ((K - A) % dif == 0 and 0 or 1)
    return 2 * t + 1

def main():
    K, A, B = map(int, sys.stdin.readline().split())
    ans = help(K, A, B)
    print(ans)

if __name__ == "__main__":
    main()