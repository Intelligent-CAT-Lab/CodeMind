def solve():
    n = int(input())
    ans = 0

    #25cent
    ans += n//25
    n %= 25

    #10cent
    ans += n//10
    n %= 10

    #5cent
    ans += n//5
    n %= 5

    #1cent
    ans += n

    print(ans)

if __name__ == "__main__":
    solve()