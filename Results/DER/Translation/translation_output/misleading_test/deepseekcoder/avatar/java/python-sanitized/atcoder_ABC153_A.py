import sys

def atcoder_ABC153_A():
    monsterHP, servalATK = map(int, sys.stdin.readline().split())

    mod = monsterHP % servalATK
    ans = monsterHP // servalATK

    if mod > 0:
        ans += 1

    print(ans)

atcoder_ABC153_A()