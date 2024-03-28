import sys

def main():
    s = []
    index = 0
    for line in sys.stdin:
        for word in line.split():
            s.append(word)
            index += 1

    r = [0] * index
    flag = [True] * 2002
    fre = 0
    for i in range(index):
        for j in range(i+1, index):
            if s[i] == s[j] and flag[j] == True:
                r[i] += 1
                flag[j] = False

    max_val = 0
    max_index = 0
    for i in range(index):
        if max_val < r[i]:
            max_val = r[i]
            max_index = i

    print(s[max_index], end=" ")
    max_val = 0
    for i in range(index):
        if len(s[max_val]) < len(s[i]):
            max_val = i

    print(s[max_val])

if __name__ == "__main__":
    main()