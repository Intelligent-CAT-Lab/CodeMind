if __name__ == "__main__":
    n, k = map(int, input().split())

    if k == 1:
        ans = 0
    else:
        ans = n - k

    print(ans)