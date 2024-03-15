import java.util

def main():
    N = int(input())
    d1 = int(input())
    x = int(input())
    ans = 0
    for i in range(N):
        ans += d1 + (N-0.5)*x
        d1 = ((2*N+2)*d1 + 5*x)/(2*N)
        x = ((N+2)/N)*x
    print(ans)

if __name__ == '__main__':
    main()