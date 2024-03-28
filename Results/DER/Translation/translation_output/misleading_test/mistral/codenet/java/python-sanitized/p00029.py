import sys

def main():
    s = []
    n = int(input())
    for i in range(n):
        s.append(input())
    r = [0] * len(s)
    flag = [True] * len(s)
    max_count = 0
    max_index = 0
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            if s[i] == s[j] and flag[j]:
                r[i] += 1
                flag[j] = False
    max_count = max(r)
    max_index = s.index(s[r.index(max_count)])
    print(s[max_index])
    max_length = max(len(s[i]) for i in range(len(s)))
    print(s[s.index(s[max_length])])

if __name__ == "__main__":
    main()