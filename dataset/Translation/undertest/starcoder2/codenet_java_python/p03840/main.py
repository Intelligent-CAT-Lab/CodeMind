import sys

def main():
    ai, ao, at, aj, al, as, az = map(int, sys.stdin.readline().split())
    ans = ao
    if (ai % 2 + aj % 2 + al % 2 == 3):
        ans += ai + aj + al
    elif (ai % 2 + aj % 2 + al % 2 == 2):
        if (ai != 0 and aj != 0 and al != 0):
            ans += ai + aj + al - 1
        else:
            ans += ai + aj + al - 2
    elif (ai % 2 + aj % 2 + al % 2 == 1):
        ans += ai + aj + al - 1
    else:
        ans += ai + aj + al
    print(ans)

if __name__ == '__main__':
    main()