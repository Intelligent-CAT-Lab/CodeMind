import sys

def main():
    N, K, S = map(int, sys.stdin.readline().split())
    if K == 0:
        if S == 1000000000:
            print("1 " * N)
        else:
            S += 1
            print((str(S) + " ") * N)
    else:
        for i in range(N):
            if i < K:
                print(str(S) + " ", end="")
            else:
                if S == 1000000000:
                    print("1 ", end="")
                else:
                    print(str(S + 1) + " ", end="")

if __name__ == "__main__":
    main()