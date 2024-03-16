import sys

def atcoder_ABC153_A():
    monsterHP = int(sys.stdin.readline().strip())
    servalATK = int(sys.stdin.readline().strip())

    mod = monsterHP % servalATK
    ans = monsterHP // servalATK

    if mod > 0:
        ans += 1

    print(ans)

atcoder_ABC153_A()