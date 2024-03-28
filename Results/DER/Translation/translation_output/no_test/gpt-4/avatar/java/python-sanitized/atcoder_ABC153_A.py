def atcoder_ABC153_A():
    monsterHP = int(input())
    servalATK = int(input())

    mod = monsterHP % servalATK
    ans = monsterHP // servalATK

    if mod > 0:
        ans += 1

    print(ans)

atcoder_ABC153_A()