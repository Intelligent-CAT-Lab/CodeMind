import sys

def main():
    data = sys.stdin.readline().split()
    N = int(data[0])
    K = int(data[1])
    S = int(data[2])

    if K == 0:
        if S == 1000000000:
            print(" ".join(["1"] * N))
        else:
            S += 1
            print(" ".join([str(S)] * N))
    else:
        for i in range(N):
            if i < K:
                print(S, end=" ")
            else:
                if S == 1000000000:
                    print("1", end=" ")
                else:
                    print(S + 1, end=" ")

if __name__ == "__main__":
    main()