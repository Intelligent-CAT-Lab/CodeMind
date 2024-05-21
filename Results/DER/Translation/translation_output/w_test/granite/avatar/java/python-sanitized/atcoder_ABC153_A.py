import sys

def main():
    monsterHP, servalATK = map(int, sys.stdin.readline().split())
    ans = (monsterHP + servalATK - 1) // servalATK
    print(ans)

if __name__ == "__main__":
    main()