import math

def main():
    N = int(input("Enter the value of N: "))
    d1 = float(input("Enter the value of d1: "))
    x = float(input("Enter the value of x: "))

    ans = 0

    for i in range(N):
        ans += d1 + (N-0.5)*x
        d1 = ((2*N+2)*d1 + 5*x)/(2*N)
        x = ((N+2)/N)*x

    print(ans)

if __name__ == "__main__":
    main()