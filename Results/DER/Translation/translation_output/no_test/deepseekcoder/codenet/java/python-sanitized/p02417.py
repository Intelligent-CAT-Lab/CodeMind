import sys

def count_letters(res):
    for line in sys.stdin:
        for c in line:
            if 'A' <= c <= 'Z':
                res[ord(c) - ord('A')] += 1
            elif 'a' <= c <= 'z':
                res[ord(c) - ord('a')] += 1
    return res

def print_counts(res):
    for i in range(26):
        print(chr(i + ord('a')) + " : " + str(res[i]))

res = [0]*26
res = count_letters(res)
print_counts(res)