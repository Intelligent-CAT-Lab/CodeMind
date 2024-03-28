import sys

def check(s):
    akihabara = "AKIHABARA"
    kihbr = "KIHBR"
    j = 0
    k = 0
    for i in range(len(s)):
        if j+1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j] != s[i]:
            j += 1
        if j >= len(akihabara) or akihabara[j] != s[i]:
            return "NO"
        if s[i] != 'A':
            if s[i] == kihbr[k]:
                k += 1
            else:
                return "NO"
        j += 1
    if k == len(kihbr):
        return "YES"
    else:
        return "NO"

if __name__ == "__main__":
    s = sys.stdin.readline()
    print(check(s))