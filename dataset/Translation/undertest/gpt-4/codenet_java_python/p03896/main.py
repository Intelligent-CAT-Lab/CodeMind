def i3y3s_challenge(n):
    if n == 2:
        print(-1)
        return
    ans = [[n if i == j else j + 1 for j in range(n - 1)] for i in range(n - 1)]
    ans.append([(i + 1) % (n - 1) + 1 for i in range(n - 1)])
    for row in ans:
        print(*row)

def main():
    n = int(input())
    i3y3s_challenge(n)

if __name__ == "__main__":
    main()