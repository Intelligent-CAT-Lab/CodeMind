def main():
    s = input()
    while "()" in s:
        s = s.replace("()", "")
    s = list(s)
    n = len(s)
    for i in range(n):
        if s[i] == "*":
            star_index = i
            break
    left = star_index - 1
    right = star_index + 1
    count = 0
    while left >= 0:
        if s[left] == "(":
            while right <= n - 1:
                if s[right] == ")":
                    count += 1
                    break
                right += 1
        left -= 1
    print(count)

if __name__ == "__main__":
    main()