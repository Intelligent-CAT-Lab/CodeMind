import sys

def main():
    akihabara = "AKIHABARA"
    kihbr = "KIHBR"
    s = sys.stdin.readline().strip()

    i = 0
    j = 0
    k = 0
    while i < len(s):
        if j + 1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j] != s[i]:
            j += 1

        if j >= len(akihabara) or akihabara[j] != s[i]:
            print("NO")
            return

        if s[i] != 'A':
            if s[i] == kihbr[k]:
                k += 1
            else:
                print("NO")
                return

        j += 1
        i += 1

    if k == len(kihbr):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()