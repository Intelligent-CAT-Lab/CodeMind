import sys

def main():
    s = []
    for line in sys.stdin:
        words = line.split()
        s.extend(words)

    r = [0] * len(s)
    flag = [True] * len(s)
    for i in range(len(s)):
        for j in range(i+1, len(s)):
            if s[i] == s[j] and flag[j]:
                r[i] += 1
                flag[j] = False

    max_r = max(r)
    max_r_index = r.index(max_r)
    print(s[max_r_index], end=" ")

    max_len = max(len(word) for word in s)
    max_len_word = [word for word in s if len(word) == max_len]
    print(max_len_word[0])

if __name__ == "__main__":
    main()