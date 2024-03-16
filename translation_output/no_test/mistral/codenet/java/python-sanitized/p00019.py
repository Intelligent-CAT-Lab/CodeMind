import sys

def main():
    #input
    n = int(input())

    #calculation
    ans = 1
    for i in range(n-1, 0, -1):
        ans *= i

    #output
    print(ans)

if __name__ == "__main__":
    main()