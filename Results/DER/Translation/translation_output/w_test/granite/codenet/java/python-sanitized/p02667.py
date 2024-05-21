def count_subarrays(s):
    n = len(s)
    ans = 0
    for i in range(n):
        if s[i] == '1':
            ans += (n - i) // 2
    return ans

def main():
    s = input()
    ans = count_subarrays(s)
    print(ans)

if __name__ == "__main__":
    main()