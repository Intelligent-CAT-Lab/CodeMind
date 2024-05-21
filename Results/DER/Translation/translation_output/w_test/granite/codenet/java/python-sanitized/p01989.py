def solve(s):
    ans = 0
    for i in range(1, len(s)-2):
        for j in range(i+1, len(s)-1):
            for k in range(j+1, len(s)):
                parts = [s[:i], s[i:j], s[j:k], s[k:]]
                if all(part.isdigit() and int(part) <= 255 for part in parts):
                    ans += 1
    return ans

def main():
    s = input()
    ans = solve(s)
    print(ans)

if __name__ == "__main__":
    main()