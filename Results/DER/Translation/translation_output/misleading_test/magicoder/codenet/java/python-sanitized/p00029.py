def main():
    s = input().split()
    r = [0] * len(s)
    flag = [True] * len(s)
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            if s[i] == s[j] and flag[j]:
                r[i] += 1
                flag[j] = False
    max_index = r.index(max(r))
    print(s[max_index])
    max_length = max(s, key=len)
    print(max_length)

if __name__ == "__main__":
    main()