import sys

def main():
    s = []
    for line in sys.stdin:
        s.append(line.strip())

    r = [0] * len(s)
    flag = [True] * len(s)
    fre = 0
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            if s[i] == s[j] and flag[j] == True:
                r[i] += 1
                flag[j] = False

    max_val = 0
    max_index = 0
    for i in range(len(s)):
        if max_val < r[i]:
            max_val = r[i]
            max_index = i

    print(s[max_index], end=" ")
    max_val = 0
    for i in range(len(s)):
        if max_val < len(s[i]):
            max_val = len(s[i])
            max_index = i

    print(s[max_index])

if __name__ == "__main__":
    main()