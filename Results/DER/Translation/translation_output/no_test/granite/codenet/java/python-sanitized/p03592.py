import sys

def main():
    N, M, K = map(int, input().split())
    for i in range(N + 1):
        for j in range(M + 1):
            if M * i + N * j - 2 * i * j == K:
                print("Yes")
                return
    print("No")

if __name__ == "__main__":
    main()