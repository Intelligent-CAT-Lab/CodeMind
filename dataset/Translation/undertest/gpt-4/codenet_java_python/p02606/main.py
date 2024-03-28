def count_divisibles(L, R, d):
    ans = 0
    for i in range(L, R+1):
        if i % d == 0:
            ans += 1
    return ans

if __name__ == "__main__":
    L, R, d = map(int, input().split())
    print(count_divisibles(L, R, d))