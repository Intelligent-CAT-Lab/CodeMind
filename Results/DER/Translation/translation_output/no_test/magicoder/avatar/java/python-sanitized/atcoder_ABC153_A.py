import sys

def main():
    monsterHP = int(sys.stdin.readline())
    servalATK = int(sys.stdin.readline())

    mod = monsterHP % servalATK
    ans = monsterHP // servalATK

    if mod > 0:
        ans += 1

    print(ans)

if __name__ == "__main__":
    main()