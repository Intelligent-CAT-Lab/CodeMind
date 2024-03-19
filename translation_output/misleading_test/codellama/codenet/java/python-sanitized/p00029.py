import sys

def main():
    sc = sys.stdin.read()
    s = sc.split()
    r = [0] * len(s)
    flag = [True] * len(s)
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            if s[i] == s[j] and flag[j]:
                r[i] += 1
                flag[j] = False
    max = 0
    maxin = 0
    for i in range(len(s)):
        if max < r[i]:
            max = r[i]
            maxin = i
    print(s[maxin], end=" ")
    max = 0
    for i in range(len(s)):
        if s[max].length() < s[i].length():
            max = i
    print(s[max])

if __name__ == "__main__":
    main()